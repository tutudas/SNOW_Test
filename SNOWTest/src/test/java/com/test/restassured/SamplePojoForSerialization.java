package com.test.restassured;

public class SamplePojoForSerialization {
	
	private String name;
	private String job;
	
	public SamplePojoForSerialization(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	

}
