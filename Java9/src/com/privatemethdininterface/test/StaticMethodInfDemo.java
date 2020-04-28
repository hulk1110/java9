package com.privatemethdininterface.test;

import com.privatemethdininterface.StaticMethodInter;

public class StaticMethodInfDemo implements StaticMethodInter {

	public static void main(String[] args) {
		StaticMethodInter.hello(); // only interface name will call to static method

	}
}
