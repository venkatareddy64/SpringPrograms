package com.satya.springBean;

public class Bean {
private int id;
private String name;
public void setId(int id)
{
	this.id=id;
}
public void setName(String name)
{
	this.name=name;
}


public void display() {
	System.out.println(id);
	System.out.println(name);

}
}
