package com.qa.main;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mainBase {
	
	String str;
	int a;
	char ch;
	mainBase mb;
	
	@BeforeMethod
	public void initializations() {
		
		
	}
	
	@Test
	public String stringy() {
		mainBase mb = new mainBase();
		
		mb.initializations();
		str = "Zeeshan SHaikh";
		return str;
		
	}

}
