package com.springmvc.luv.model;

public class RegistrationModel {
	private String txtname;
	private String txtuser;
	private char[] txtpass;
	private String country;
	
	
	public String getTxtname() {
		return txtname;
	}
	public void setTxtname(String txtname) {
		this.txtname = txtname;
	}
	public String getTxtuser() {
		return txtuser;
	}
	public void setTxtuser(String txtuser) {
		this.txtuser = txtuser;
	}
	public char[] getTxtpass() {
		return txtpass;
	}
	public void setTxtpass(char[] txtpass) {
		this.txtpass = txtpass;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
