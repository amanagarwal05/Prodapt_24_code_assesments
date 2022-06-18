package com.prodapt.assignment;

public class TestControlller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee("Aman",21,"CEO");
		Hr_Manager obj2=new Hr_Manager();
		obj=obj2.display(obj);
		obj2.processRecords();
		System.out.println(" ");
		
		Employee obj3=new Employee("Aneesha",21,"Director");
		obj3=obj2.display(obj3);
		obj2.processRecords();
		System.out.println(" ");
		
		Employee obj5=new Employee("Amar",21,"softwareDeveloper");
		obj5=obj2.display(obj5);
		obj2.processRecords();
		System.out.println(" ");
		
		Employee obj7=new Employee("Shashank",23,"ASD");
		obj7=obj2.display(obj7);
		obj2.processRecords();
		System.out.println(" ");
		
		Employee obj9=new Employee("Saketh",24,"ASD");
		obj9=obj2.display(obj9);
		obj2.processRecords();
		System.out.println(" ");

	}

}
