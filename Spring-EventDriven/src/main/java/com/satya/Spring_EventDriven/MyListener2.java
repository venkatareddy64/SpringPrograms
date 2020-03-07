package com.satya.Spring_EventDriven;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;
@Component
public class MyListener2 implements ApplicationListener<ContextClosedEvent> {
	public void onApplicationEvent(ContextClosedEvent event)
	{
		System.out.println("context closed");
	}

}
