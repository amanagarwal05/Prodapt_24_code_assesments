package com.prodapt.assignment;

public class SimpleInterest {
	static int pri,time,rate;
	
	void siprocess(int pri,int time,int rate) {
		this.pri=pri;
		this.time=time;
		this.rate=rate;
		int result=(pri*time*rate)/100;
		int totalamount=result+pri;
		System.out.println("Amount to be paid after loan end is: "+totalamount);
		
		
		
	}

}
