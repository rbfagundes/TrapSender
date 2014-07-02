package br.com.parks.varbind;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Varbind implements Serializable {
	private VarbindType type;
	private String value;

	public Varbind(VarbindType type, String value) {
		this.type = type;
		this.value = value;
	}

	public VarbindType getType() {
		return type;
	}

	public void setType(VarbindType type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.type + " - " + this.value;
	}
}
