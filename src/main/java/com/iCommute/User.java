package com.iCommute;

public class User {
	private String email;
	private String mobNo;
	private String defaultLoc;
	private String securityCode;
	
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getDefaultLoc() {
		return defaultLoc;
	}
	public void setDefaultLoc(String defaultLoc) {
		this.defaultLoc = defaultLoc;
	}

}
