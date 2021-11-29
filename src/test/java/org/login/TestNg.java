package org.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg {
	@BeforeSuite
	private void tb1() {
		System.out.println("@beforeuite");
	}
	@AfterClass
	private void tc4() {
		System.out.println("@afterclass");
	}
	@BeforeMethod
	private void tc2() {
		System.out.println("@Beforemethod");
	}
	@Test
	private void tc5() {
		System.out.println("afsfsf");
	}
	@AfterMethod
	private void tc7() {
		System.out.println("@aftermethod");
	}
	@BeforeClass
	private void tc8() {
		System.out.println("@beforeclass");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
