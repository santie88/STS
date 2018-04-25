package com.tutorial.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.beans.Player;
//import com.tutorial.interfaces.ITeam;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/tutorial/xml/beans.xml");
		Player player = (Player) appContext.getBean("messi");
		
		//player.setTeam((ITeam) appContext.getBean("juventus"));
		
		System.out.println(player.getName() + " " + player.getNumber() + " " + player.getTeam().Show());
		
		((ConfigurableApplicationContext) appContext).close();

	}

}
