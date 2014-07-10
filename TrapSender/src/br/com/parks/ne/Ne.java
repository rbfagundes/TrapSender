package br.com.parks.ne;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Ne implements Serializable {
	private long Id;
	private String IP;
	private int port;

	public Ne(String IP, int port) {
		this.IP = IP;
		this.port = port;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String toString() {
		return this.getIP() + " : " + this.port;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}
}
