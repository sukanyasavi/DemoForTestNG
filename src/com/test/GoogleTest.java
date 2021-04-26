package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GoogleTest
{

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKANYA\\eclipse-workspace\\Downloads\\chromedriver_win32");
		
	}
	@Test(priority=2,groups="google")
	public void googleTitleTest()
	{
	String title = driver.getTitle();	
	System.out.println(title);
	}
	@Test(priority=1,groups="google")
	public void maillinkTest()
	{
		 boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		 System.out.println(b);
	}
	@Test(priority=3,groups="test")
	public void logoTest()
	{
		boolean c=driver.findElement(By.className("lnXdpd")).isDisplayed();
		System.out.println(c);
	}
	@Test(dependsOnMethods="logoTest")
	public void login()
	{
		System.out.println("home page");
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
