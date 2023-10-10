package com.group.test;

import org.testng.annotations.Test;

public class Program1 {
	
	@Test(groups = {"login"})
	public void loginFunction() {
		System.out.println("for login user = 1");
	}
	
	@Test(groups = {"credentials"})
	public void userData() {
		System.out.println("this is user data");
	}
	
	@Test
	public void exit() {
		System.out.println("to exit from page");
	}
}
