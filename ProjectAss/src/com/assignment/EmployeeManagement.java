package com.assignment;


public class EmployeeManagement {
	private int id;
	private String name;
	private double salary;
	
	public EmployeeManagement(int eid,String name,double salary)
	{
		id=eid;
		this.name=name;
		this.salary=salary;
	}
	
	public int getid()
	{
		return id;
	}
	
	
	public String getname()
	{
		return name;
	}
	
	public double getsal()
	{
		return salary;		
	}
	
	public void displayDetails()
	{
		System.out.println("id:"+getid());
		System.out.println("name:"+getname());
		System.out.println("salary:"+getsal());
	}
}


