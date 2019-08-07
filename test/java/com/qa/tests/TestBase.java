package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.main.mainBase;

public class TestBase extends mainBase {
	
	@Test(priority=1)
	public void firstTestcase() {
		System.out.println("Hello TestNG");
	}
	

	public int multiply(int num1, int num2) {
	int	mul = num1*num2;
	return mul;
	}
	
	@Test(priority=2)
	public void testMultiply() {
		TestBase TestBase = new TestBase();
		int a=2;
		int b=3;
		int mulres = TestBase.multiply(a, b);
		System.out.println("Multiplication of " +a + " and " +b+ " is " + mulres);
	}

}
