package com.test;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileDownload 
{

	@Test
	public void downloadFile() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		String downloadPath = System.getProperty("user.dir");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		
		options.setExperimentalOption("prefs",chromePrefs);
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://omayo.blogspot.com/p/page7.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("ZIP file")).click();
		
		Thread.sleep(23000); 
		
		String filePathUpdated = downloadPath+"\\DownloadDemo-master.zip";
		
		File file = new File(filePathUpdated);
		
		Assert.assertTrue(file.exists());
		
     	file.delete();
			
		

	}
}
