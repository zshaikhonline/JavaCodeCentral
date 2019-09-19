package com.qa.container;

interface Test {
	String home();
}

class Child {
	void zeeshan() {
		System.out.println("Never Give up! Zeeshan");
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.zeeshan();

		Test tst = () -> {

			return "HI Lambda";

		};
		System.out.println(tst.home());
	}
}