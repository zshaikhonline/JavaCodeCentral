package com.qa.container;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		ScannerClass scc = new ScannerClass();
		scc.fnage();
		scc.fnName();
		

	}
	
	public void fnage() {
		Scanner sc1 = new Scanner(System.in);
		int age;
		System.out.println("Enter your age");
		int age1 = sc1.nextInt();
		System.out.println(age1);
	}
	
	public void fnName() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your name");
		String inputtxt;
		inputtxt = sc.next();
		System.out.println(inputtxt);
		
	}

}
