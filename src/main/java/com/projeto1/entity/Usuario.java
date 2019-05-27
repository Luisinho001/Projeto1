package com.projeto1.entity;

import java.util.Set;

import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document
public class Usuario {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String nome;
	private String email;
	
	//@ManyToMany
	private Set<Role> roles;
	
	public Usuario() {
		super();
	}
	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
