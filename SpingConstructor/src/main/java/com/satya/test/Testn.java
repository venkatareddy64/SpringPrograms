package com.satya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satya.Construct;

public class Testn {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("AppConfig.xml");
	Construct c=(Construct)ctx.getBean("i");
	c.display();
	}

}
