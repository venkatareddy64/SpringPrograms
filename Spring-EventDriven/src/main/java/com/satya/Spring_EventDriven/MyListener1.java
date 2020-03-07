package com.satya.Spring_EventDriven;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
@Component
public class MyListener1 implements ApplicationListener<ContextRefreshedEvent> {
	public void onApplicationEvent(ContextRefreshedEvent event)
	{
		System.out.println("content refreshed");
		System.out.println("cache refreshed");
	}

}
