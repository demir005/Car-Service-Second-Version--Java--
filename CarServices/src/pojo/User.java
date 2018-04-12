/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Demir
 */
public class User {
	
	private Integer id;
	private String username;
	private String password;
	
	public Integer getId(){
		return this.id;
	}

	public void setId(Integer id){
		this.id = id;
	}
	
	public String getUsername(){
		return this.username;
	}

	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return this.password;
	}

	public void setPassword(String password){
		this.password = password;
	}
	
}

