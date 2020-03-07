package com.satya.Listner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tst {

	public static void main(String[] args) {
		try
		{
			Thread.sleep(1000);
		}catch(Exception e)
		{
			
		}

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
try {
	Thread.sleep(1000);
}catch(Exception e)
{
	
}
ctx.close();
	
	
	
	}
	

}
