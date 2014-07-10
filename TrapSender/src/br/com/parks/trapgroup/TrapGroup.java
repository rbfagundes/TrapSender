package br.com.parks.trapgroup;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TrapGroup implements Serializable {
	private long Id;

	private String name;

	public TrapGroup() {
	}

	public TrapGroup(String name) {
		this.name = name;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name;
	}
}
