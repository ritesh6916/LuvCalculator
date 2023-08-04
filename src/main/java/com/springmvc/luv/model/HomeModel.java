package com.springmvc.luv.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class HomeModel {

	private String txtuname="Mr X";
	private String txtcrush="Miss Y";
	
	public HomeModel() {
		System.out.println("HomeModel being called..");		
	}
	public String getTxtuname() {
		return txtuname;
	}
	public void setTxtuname(String txtuname) {
		this.txtuname = txtuname;
	}
	public String getTxtcrush() {
		return txtcrush;
	}
	public void setTxtcrush(String txtcrush) {
		this.txtcrush = txtcrush;
	}
	@Override
	public String toString() {
		return "HomeModel [txtuname=" + txtuname + ", txtcrush=" + txtcrush + "]";
	}
	
}
