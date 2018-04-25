package com.tutorial.beans;

//import javax.annotation.*;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean { 
	
	private int id;
	private String name;
	private String surname;
	private Country	country;
	private City city;
	
//	@PostConstruct
//	private void Init() {
//		System.out.println("Init method.....");
//	}
//	
//	@PreDestroy
//	private void End() {
//		System.out.println("End method....");
//	}

	public void destroy() throws Exception {
		System.out.println("Init method.....");		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("End method....");		
	}	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
}
