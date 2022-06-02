package com.tecsup.petclinic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author victor
 *
 */

@Entity(name = "owners")
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String first_name;
	private String last_name;
	private String telephone;
	
	public Owner() {
	}

	public Owner(long id, String first_name, String last_name, String telephone) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.telephone = telephone;
	}
	
	public Owner(String first_name, String last_name, String telephone) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.telephone = telephone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", telephone="
				+ telephone + "]";
	}
		
}
