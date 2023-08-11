package com.springmvc.luv.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class HomeModel {

	@NotBlank(message = "* Your Name is invalid")
	@Size(min = 4,max = 15,message = "* Your Name should B/W 4 to 15 characters ")
	private String txtuname;
	private String txtcrush;
	
	public HomeModel() {
		//System.out.println("HomeModel being called..");		
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
