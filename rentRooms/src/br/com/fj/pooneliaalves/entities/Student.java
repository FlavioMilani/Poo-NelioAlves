package br.com.fj.pooneliaalves.entities;

public class Student {
	private String name;
	private String mail;
	
	public Student(String name, String mail) {
		this.name = name;
		this.mail = mail;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return mail;
	}
	public void setEmail(String email) {
		this.mail = email;
	}
}
