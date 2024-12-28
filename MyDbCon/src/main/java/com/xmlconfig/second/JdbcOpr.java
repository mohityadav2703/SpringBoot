package com.xmlconfig.second;

public class JdbcOpr {

	private MyDbCon con;

	public JdbcOpr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDbCon getCon() {
		return con;
	}

	public void setCon(MyDbCon con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "JdbcOpr [con=" + con + "]";
	}
	
	

}
