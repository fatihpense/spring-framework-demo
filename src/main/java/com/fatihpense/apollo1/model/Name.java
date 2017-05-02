package com.fatihpense.apollo1.model;

public class Name {

	private long counterId;
	private String name;
	private String surname;

	public Name(long counterId,String name, String surname) {
		this.counterId = counterId;
		this.name = name;
		this.surname = surname;
	}

	public long getCounterId() {
		return counterId;
	}

	public void setCounterId(long counterId) {
		this.counterId = counterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
