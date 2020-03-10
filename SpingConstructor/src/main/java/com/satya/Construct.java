package com.satya;

public class Construct {
private int id;
private String name;
private String address;
private double salary;
public Construct(int id,String name,String address,double salary) {
	this.id=id;
	this.name=name;
	this.address=address;
	this.salary=salary;
}
public void display()
{
	System.out.println(id);
	System.out.println(name);
	System.out.println(address);
	System.out.println(salary);
}
}
