package br.com.parks.service;

import java.util.List;

import br.com.parks.ne.Ne;
import br.com.parks.sender.Sender;
import br.com.parks.trap.Trap;
import br.com.parks.varbind.VarbindType;

import com.adventnet.snmp.snmp2.SnmpAPI;
import com.adventnet.snmp.snmp2.SnmpException;
import com.adventnet.snmp.snmp2.SnmpOID;
import com.adventnet.snmp.snmp2.SnmpPDU;
import com.adventnet.snmp.snmp2.SnmpSession;
import com.adventnet.snmp.snmp2.SnmpVar;
import com.adventnet.snmp.snmp2.SnmpVarBind;
import com.adventnet.snmp.snmp2.UDPProtocolOptions;

public class SenderServiceImpl implements SenderService {
	TrapServiceImpl trapService = new TrapServiceImpl();
	TrapGroupServiceImpl groupService = new TrapGroupServiceImpl();
	NEServiceImpl neService = new NEServiceImpl();

	@SuppressWarnings("static-access")
	public void send(Sender sender) {
		List<Trap> traps = trapService.getTrapsByGroup(sender.getGroup()
				.getId());

		for (Ne ne : neService.getNes()) {
			for (Trap trap : traps) {
				SnmpAPI api = new SnmpAPI();

				// Open session
				SnmpSession session = new SnmpSession(api);
				// set name
				// session.setName(trap.getName());

				// set v2c version 
				session.setVersion(SnmpAPI.SNMP_VERSION_2C);

				// set remote Host (manager)
				UDPProtocolOptions ses_opt = new UDPProtocolOptions(
						sender.getIpManager());
				ses_opt.setRemotePort(sender.getPort());

				// set comunity
				// session.setCommunity(trap.getComunity());
				session.setCommunity("public");

				// set protocol options
				session.setProtocolOptions(ses_opt);

				// Build v2 trap PDU
				SnmpPDU pdu = new SnmpPDU();
				// pdu.setCommand(api.TRP2_REQ_MSG);

				pdu.setCommand(api.TRP2_REQ_MSG);
				pdu.setAgentAddr("192.168.5.42");

				// set agent
				/*
				 * InetAddress adrAddress = null; try { adrAddress =
				 * InetAddress.getByName(ne.getIP());
				 * pdu.setAgentAddress(adrAddress); // //
				 * pdu.setAgentAddr("192.168.5.42/162");
				 * System.out.println(adrAddress); } catch (UnknownHostException
				 * e1) { e1.printStackTrace(); }
				 */

				// Add the sysUpTime variable binding
				SnmpOID oid = new SnmpOID(".1.3.6.1.2.1.1.3.0");
				// ADD VARBINDS - TIMETICK E OID
				// add varbind - TIMETICK
				SnmpVar var = null;
				try {
					// DateFormat df = new
					// SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					// String timetickDate = df.format(new Date());
					var = SnmpVar.createVariable("139", SnmpAPI.TIMETICKS);
				} catch (SnmpException e) {
					System.err.println("erro 1");
					System.out.println(e);
				}
				SnmpVarBind varbind = new SnmpVarBind(oid, var);
				pdu.addVariableBinding(varbind);

				// add varbind - OID
				oid = new SnmpOID(".1.3.6.1.6.3.1.1.4.1.0");
				var = null;
				try {
					var = SnmpVar.createVariable(".1.3.6.1.6.3.1.1.5.1",
							SnmpAPI.OBJID);
				} catch (SnmpException e) {
					System.out.println("erro 2");
					System.out.println(e);
				}
				varbind = new SnmpVarBind(oid, var);
				pdu.addVariableBinding(varbind);

				/*
				 * // add varbinds for (Varbind v : trap.getVarbinds()) {
				 * addVarBind(pdu, oid, v.getType(), v.getValue()); }
				 */

				// send
				try {
					// open session
					session.open();
					// Send PDU
					session.send(pdu);
					System.out.println("ok");

				} catch (Exception e) {
					System.err.println("Sending PDU" + e.getMessage());
				} finally {
					// close session
					session.close();
					// stop api thread
					api.close();
				}
				System.out.println("fim");
			}
		}
	}

	private byte getVarbindType(VarbindType type) {
		switch (type) {
		case GAUGE:
			return SnmpAPI.GAUGE;
		case INTEGER:
			return SnmpAPI.INTEGER;
		case STRING:
			return SnmpAPI.STRING;
		case TIMETICKS:
			return SnmpAPI.TIMETICKS;
		default:
			return 0;
		}
	}

	private void addVarBind(SnmpPDU pdu, SnmpOID oid, VarbindType type,
			String value) {

		SnmpVar var = null;
		try {
			// create variable
			var = SnmpVar.createVariable(value, getVarbindType(type));
		} catch (SnmpException e) {
			System.out.println("erro 3");
			System.out.println(e);
			return;
		}

		// create varbind
		SnmpVarBind varbind = new SnmpVarBind(oid, var);
		// add variable binding
		pdu.addVariableBinding(varbind);
	}
}
