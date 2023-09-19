package com.demo.murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private String profession;
    private boolean boo;
	public User() {
		firstName = "";
		lastName = "";
		email = "";
		contact="";
		profession ="";
		boo = false;
	}

	public User(String firstName, String lastName, String email , String contact , boolean boo, String profession)
	{
		this.contact = contact;
		this.boo = boo;
		this.profession = profession;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public boolean getBoo() {
		return boo;
	}

	public void setBoo(boolean boo) {
		this.boo = boo;
	}
}
