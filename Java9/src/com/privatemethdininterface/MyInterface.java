package com.privatemethdininterface;

public interface MyInterface {

	public default void method1() {
		commonCode();
		System.out.println("This is some content to method1");
	}

	public default void method2() {
		commonCode();
		System.out.println("This is some content to method2");
	}

	private void commonCode() {
		System.out.println("This method has common code needed for method1 and method2");
	}

}
