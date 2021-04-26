package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountValidationException 
{
	WebDriver driver;
//	
	@BeforeMethod
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKANYA\\eclipse-workspace\\Downloads\\chromedriver_win32");
		
	}

//	@Test(invocationCount=10)
//	public void sum()
//	{
//	int a=10;
//	int b=20;
//	int c=a+b;
//	System.out.println(c);
//	}
//	
//	@Test(expectedExceptions=NumberFormatException.class)
//	public void exception()
//	{
//		String a="100A";
//		Integer.parseInt(a);
//	}
	@Test
	public void validate()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google123", "title not matched");
	}
}
