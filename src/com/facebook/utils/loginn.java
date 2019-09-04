package com.facebook.utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class loginn {
public WebDriver takeinput(WebDriver drv) throws Exception {
		
	Properties obj = new Properties();
	FileInputStream objfile = new FileInputStream("C:\\Users\\Roshan\\Downloads\\Testing Workspace\\POMFacebookTest\\repositoryfile.properties");
	obj.load(objfile);
	System.out.println("I am in parent login1");
	
	drv.findElement(By.xpath(obj.getProperty("Login_ID_Xpath"))).sendKeys(obj.getProperty("userName"));
	drv.findElement(By.xpath(obj.getProperty("Login_Pass_Xpath"))).sendKeys(obj.getProperty("userPassword"));
	
	System.out.println("After pass");
	
	drv.findElement(By.xpath(obj.getProperty("Login_Button_Xpath"))).click();
	drv.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);				
	Actions action = new Actions(drv);
	action.sendKeys(Keys.ESCAPE).perform();
	return drv;
	}	

}
