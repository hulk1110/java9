package com.privatemethdininterface.test;

import com.privatemethdininterface.MyInterface;

public class PrivateMethodDemo implements MyInterface {

	public static void main(String[] args) {
		PrivateMethodDemo demo = new PrivateMethodDemo();
		demo.method1();
		demo.method2();
	}
}
