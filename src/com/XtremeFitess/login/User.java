/**
 * 
 */
package com.XtremeFitess.login;

/**
 * @author Acharya Kamini
 *
 */
public class User {
	

    private String id;
	private String name;
	private String email;
	private String password;
	private String Confirm_password ;
	
	public  User(){}
	public User(String name, String email, String password, String confirm_password) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.Confirm_password = confirm_password;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return Confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		Confirm_password = confirm_password;
	}
	@Override
	public String toString() {
		return   id+"\t"+name + "\t" + email + "\t" + password + "\t"+ Confirm_password;
	}



}
