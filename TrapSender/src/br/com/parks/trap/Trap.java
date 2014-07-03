package br.com.parks.trap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.parks.varbind.Varbind;

@SuppressWarnings("serial")
public class Trap implements Serializable {
	private long Id;
	private String name;
	private String OID;
	private String comunity;
	private List<Varbind> varbinds = new ArrayList<Varbind>();

	public Trap() {
	}

	public Trap(String name, String OID, String comunity, List<Varbind> varbinds) {
		this.name = name;
		this.OID = OID;
		this.comunity = comunity;
		this.varbinds = varbinds;
	}

	public long getId() {
		return this.Id;
	}

	public void setId(long id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOID() {
		return OID;
	}

	public void setOID(String oID) {
		OID = oID;
	}

	public String getComunity() {
		return comunity;
	}

	public void setComunity(String comunity) {
		this.comunity = comunity;
	}

	public List<Varbind> getVarbinds() {
		return varbinds;
	}

	public void setVarbinds(List<Varbind> varbinds) {
		this.varbinds = varbinds;
	}

	@Override
	public String toString() {
		return this.OID + " - " + this.name;
	}
}
