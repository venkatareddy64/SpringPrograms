package com.satya;
import java.util.*;
public class DemoBean {
	private int studentId;
	
	 List addressList;
	 Set addressSet;
	 Map addressMap;
	 Properties addressProp;
	    public void setStudentId(int studentId)
	     {
		    this.studentId=studentId;
	     }
	    public void setAddressList(List addressList) {
		      this.addressList = addressList;
		   }
	    public void setAddressSet(Set addressSet)
	      {
		   this.addressSet=addressSet;
	      }
	    public void setAddressMap(Map addressMap)
	    {
	    	this.addressMap=addressMap;
	    }
	    public void setAddressProp(Properties addressProp)
	    {
	    	this.addressProp=addressProp;
	    }
	   
	   
	  
public void display()
	{
		System.out.println(studentId);
		System.out.println(addressList);
		System.out.println(addressSet);
		System.out.println(addressProp);
	
	}

}
