package com.tutorial.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.beans.Person;

public class AppPerson {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/tutorial/xml/beans.xml");
		Person person = (Person) appContext.getBean(Person.class);
		
		System.out.println(person.getId() + " " + person.getName() + " " + person.getSurname() + " " + person.getCountry().getName() + " " + person.getCity().getName());
		
		((ConfigurableApplicationContext) appContext).close();
	}

}
