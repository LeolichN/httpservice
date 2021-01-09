package com.jd.httpservice.agent;

public class CustomHeader implements RequestHeader{
	
	private String name;
	
	private String value;
	
	public CustomHeader(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getValue() {
		return value;
	}

}
