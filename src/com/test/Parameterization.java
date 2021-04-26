package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Parameterization 
{

	WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void loginTest(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://account.magento.com/customer/account/login");
		driver.findElement(By.id("email")).sendKeys("sukanyasavi234@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("Jaiganesh@123");
		driver.findElement(By.id("send2")).click();
		driver.quit();
	}
}
