package com.spring.lifecycle;

public class Patient {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	public void start()
	{
		System.out.println("Inside Start method!");
	}
	
	public void end()
	{
		System.out.println("Inside destroy method");
	}
	
	

}
