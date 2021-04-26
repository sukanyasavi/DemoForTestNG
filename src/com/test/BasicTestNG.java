package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestNG 
{

	@BeforeSuite//1
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	@BeforeTest//2
	public void beforeTest()
	{
		System.out.println("before test");
	}
	@BeforeClass//3
	public void beforeClass()
	{
		System.out.println("beforeclass");
	}
	@BeforeMethod//4
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	@Test//5
	public void test()
	{
		System.out.println("test case");
	}
	
	@AfterMethod//6
	public void afterMethod()
	{
		System.out.println("afetr  method");
	}
	@AfterClass//7
	public void afterClass()
	{
		System.out.println("after class");
	}
	
	@AfterSuite
	public void afterSuite()//8
	{
		System.out.println("after suite");
	}
}
