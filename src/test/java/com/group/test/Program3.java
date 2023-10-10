package com.group.test;

import org.testng.annotations.Test;

public class Program3 {
	@Test(groups = {"login"})
	public void loginFunction() {
		System.out.println("for login user = 3");
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
