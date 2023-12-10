package com.test.files;

public class Employee {
	
	
	private int id;
	private long sal;
	
	public Employee(int id, long sal) {
		super();
		this.id = id;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + "]";
	}
	

}
