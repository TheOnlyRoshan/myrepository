package com.facebook.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class SuperFB {
	public WebDriver dr;
	@BeforeTest
	public void launchchrome() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roshan\\Downloads\\Drivers\\Chrome Driver\\chromedriver.exe");
	dr = new ChromeDriver();
	dr.get("https://www.facebook.com");
	dr.manage().window().maximize();
	}
	@AfterTest
	public void closebrowser() {
		System.out.println("quit");
		dr.close();
	}
	
}