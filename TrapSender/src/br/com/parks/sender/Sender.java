package br.com.parks.sender;

import java.util.ArrayList;
import java.util.List;

import br.com.parks.ne.Ne;
import br.com.parks.trapgroup.TrapGroup;

public class Sender {
	private String ipManager;
	private int port;
	private List<Ne> nes = new ArrayList<Ne>();
	private TrapGroup group;
	private int quantity;
	private int sendInterval;
	private int repeatInterval;

	public String getIpManager() {
		return ipManager;
	}

	public void setIpManager(String ipManager) {
		this.ipManager = ipManager;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public List<Ne> getNes() {
		return nes;
	}

	public void setNes(List<Ne> nes) {
		this.nes = nes;
	}

	public TrapGroup getGroup() {
		return group;
	}

	public void setGroup(TrapGroup group) {
		this.group = group;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSendInterval() {
		return sendInterval;
	}

	public void setSendInterval(int sendInterval) {
		this.sendInterval = sendInterval;
	}

	public int getRepeatInterval() {
		return repeatInterval;
	}

	public void setRepeatInterval(int repeatInterval) {
		this.repeatInterval = repeatInterval;
	}

}
