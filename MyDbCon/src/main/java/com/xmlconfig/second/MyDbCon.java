package com.xmlconfig.second;

public class MyDbCon {
	private String driver;
	private String url;
	public MyDbCon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "MyDbCon [driver=" + driver + ", url=" + url + "]";
	}

}
