package com.privatemethdininterface;

public interface Right {
	default public  void hello() {
		System.out.println("Hello from Right");
	}
}
