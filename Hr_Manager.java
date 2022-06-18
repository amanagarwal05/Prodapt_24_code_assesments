package com.prodapt.assignment;

public class Hr_Manager {
	String n;
	int a;
	String d;
	public Employee display(Employee x) {
		n=x.getName();
		a=x.getAge();
		d=x.getDesignation();
		return x;
	}
	void processRecords()
	{
		System.out.println("Employee Details:");
		System.out.println("Name="+n);
		System.out.println("age="+a);
		System.out.println("Designation="+d);
	}

}
