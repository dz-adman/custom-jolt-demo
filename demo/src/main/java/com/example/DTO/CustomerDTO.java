package com.example.DTO;

public class CustomerDTO {
	
	public CustomerDTO() {}
	
	public CustomerDTO(String accountName, String date) {
		super();
		this.accountName = accountName;
		this.date = date;
	}

	private String accountName;
	
	private String date;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
