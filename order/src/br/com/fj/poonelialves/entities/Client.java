package br.com.fj.poonelialves.entities;

import java.util.Date;

public class Client {
	private String name;
	private String mail;
	private Date birthDate;
	
	public Client() {
	}
	
	public Client(String name, String mail, Date birthDate) {
		this.name = name;
		this.mail = mail;
		this.birthDate = birthDate;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
