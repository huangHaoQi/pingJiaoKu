package com.hhq.models;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EasySpring {

	private String who = null;
	
	public void print() {
		System.out.println("So Easy" + this.getWho());
	}

	public String getWho() {
		return who;
	}
	public void setWho(String who) {
		this.who = who;
	}
	
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		EasySpring easySpring = (EasySpring)context.getBean("easySpring");
		easySpring.print();
	}
}
