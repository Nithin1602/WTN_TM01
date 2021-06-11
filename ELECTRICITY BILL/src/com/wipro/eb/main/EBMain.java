package com.wipro.eb.main;
import com.wipro.eb.service.ConnectionService;

public class EBMain {
	public static void main(String a[])
	{
		ConnectionService cs=new ConnectionService();
	System.out.println(cs.generateBill(250,130,"Commercial"));
	System.out.println(cs.generateBill(0,0,"Commercial"));
	System.out.println(cs.generateBill(250,130,"Domestic"));
	System.out.println(cs.generateBill(0,0,"Domestic"));
	System.out.println(cs.generateBill(-5,0,"Domestic"));
	System.out.println(cs.generateBill(123,-50,"Domestic"));
	}


}
