package com.qa.main;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class mainBase {
	
	String str;
	int a;
	char ch;
	mainBase mb;
	
	@BeforeMethod
	public void fnbeforeMethod() {
		
		System.out.println("This is before method");
	}
	
	public String fnStringy() {
		mainBase mb = new mainBase();
		
		mb.fnbeforeMethod();
		str = "Zeeshan SHaikh";
		return str;
		
	}
	
	@AfterMethod
	public void fnAfterMethod() {
		System.out.println("This is after Method");
	}

}
