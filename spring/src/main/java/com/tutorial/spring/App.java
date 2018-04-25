package com.tutorial.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.beans.AppConfig;
import com.tutorial.beans.World;

public class App {

	public static void main(String[] args) {
		 
		//XML
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/tutorial/xml/beans.xml");
		
		//Annotations
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//OR
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.refresh();
		
		World w = (World) appContext.getBean("world");
		
		System.out.println(w.getHello());
	}
}