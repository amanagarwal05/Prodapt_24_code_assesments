package com.prodapt.assignment;

public class Schoolrecords {
	int id;
	String name;
	String address;
	
	void ddRecords(int sch_id,String sch_name,String sch_address)
	{
		id= sch_id;
		name=sch_name;
		address=sch_address;
		
		System.out.println("details added");
	}
	void dispRecords()
	{
		System.out.println("School details:");
		System.out.println("id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address : "+address);
	}

}
