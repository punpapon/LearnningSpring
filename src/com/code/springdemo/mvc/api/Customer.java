package com.code.springdemo.mvc.api;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class Customer {

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1)
	private String lastNamme;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNamme() {
		return lastNamme;
	}

	public void setLastNamme(String lastNamme) {
		this.lastNamme = lastNamme;
	}

	
}
