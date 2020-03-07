package com.satya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satya.springBean.Bean;

public class TestProg {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Bean b=(Bean) ctx.getBean("id");
		b.display();
		
	}

}
