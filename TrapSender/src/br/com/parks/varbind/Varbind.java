package br.com.parks.varbind;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Varbind implements Serializable {
	private String name;
	private VarbindType type;
	private String value;

	public Varbind(String value) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		if (getName() != null)
			return this.type + " - " + this.value + " - Copy";
		else
			return this.type + " - " + this.value;
	}
}
