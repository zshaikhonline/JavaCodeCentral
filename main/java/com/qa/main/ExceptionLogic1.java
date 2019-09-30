package com.qa.main;

class ExceptionLogic1 extends Exception {
	ExceptionLogic1(String s) {
		super(s);
	}

}

class ExceptionLogic {
	static void logic(int age) throws ExceptionLogic1 {
		if (age < 18) {
			throw new ExceptionLogic1("Invalid age");
		} else {
			System.out.println("valid age");
		}

	}

	public static void main(String[] args) {
		try {
			logic(5);
		} catch (Exception e) {
			System.out.println("Custom exception is thrown" + e);
		}
		System.out.println("rest of the code");
	}
}