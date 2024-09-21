package com.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {
	
	@Id
	private Long accountno;
	private String holdername;
	private String bankname;
	private String bankaddress;
	
	public Bank() {
		super();
	}

	public Bank(Long accountno, String holdername, String bankname, String bankaddress) {
		super();
		this.accountno = accountno;
		this.holdername = holdername;
		this.bankname = bankname;
		this.bankaddress = bankaddress;
	}

	public Long getAccountno() {
		return accountno;
	}

	public void setAccountno(Long accountno) {
		this.accountno = accountno;
	}

	public String getHoldername() {
		return holdername;
	}

	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBankaddress() {
		return bankaddress;
	}

	public void setBankaddress(String bankaddress) {
		this.bankaddress = bankaddress;
	}

	@Override
	public String toString() {
		return "Bank [accountno=" + accountno + ", holdername=" + holdername + ", bankname=" + bankname
				+ ", bankaddress=" + bankaddress + "]";
	}
	
	
	
	
	
	

}
