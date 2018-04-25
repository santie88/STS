package com.tutorial.beans;

import org.springframework.beans.factory.annotation.Value;

public class World {
	
	@Value("Hello World!")
	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
	
}
