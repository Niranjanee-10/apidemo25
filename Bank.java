package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="RBI_Bank")
public class Bank {
	@Id
	@Column(name="Acc_no")
	private int Acc_no;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Acc_type")
	private String Acc_type;
	
	@Column(name="Balance")
	private int Balance;

	public int getAcc_no() {
		return Acc_no;
	}

	public void setAcc_no(int acc_no) {
		Acc_no = acc_no;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAcc_type() {
		return Acc_type;
	}

	public void setAcc_type(String acc_type) {
		Acc_type = acc_type;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public Bank() {
	
	}

	public Bank(int acc_no, String name, String acc_type, int balance) {
		super();
		Acc_no = acc_no;
		Name = name;
		Acc_type = acc_type;
		Balance = balance;
	}
	
	
	

	
	
}
