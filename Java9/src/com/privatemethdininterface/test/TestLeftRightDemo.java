package com.privatemethdininterface.test;

import com.privatemethdininterface.Left;
import com.privatemethdininterface.Right;

public class TestLeftRightDemo implements Left, Right {

	@Override
	public void hello() {
		// take hello from Left
	//	Left.super.hello();
		// take hello from Left
	//	Right.super.hello();
		System.out.println("I will say hello by my own");
	}

	public static void main(String[] args) {
		TestLeftRightDemo leftRight = new TestLeftRightDemo();
		leftRight.hello();
	}
}
