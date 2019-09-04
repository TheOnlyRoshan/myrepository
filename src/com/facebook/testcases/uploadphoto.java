package com.facebook.testcases;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.facebook.utils.loginn;
import com.facebook.utils.ss;

public class uploadphoto extends SuperFB {
	
	@Test
	public void pic() throws Exception {
		try {
		
		loginn l = new loginn();
		l.takeinput(dr);
		
		System.out.println("This is in pic method");
		
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream("C:\\Users\\Roshan\\Downloads\\Testing Workspace\\POMFacebookTest\\repositoryfile.properties");
		obj.load(objfile);
		
		Thread.sleep(4000);
		WebElement upload = dr.findElement(By.xpath(obj.getProperty("Photo_upload_button_xpath")));
		    	System.out.println("after clicking upload button");
		    	Actions actions = new Actions(dr);
		    	actions.moveToElement(upload).click().perform();
		upload.sendKeys("C:\\Users\\Roshan\\Downloads\\autotest.png");
		System.out.println("After uploading files");
        dr.findElement(By.xpath(obj.getProperty("Intro_to_photo"))).sendKeys("This is an automation testing test");
        dr.findElement(By.xpath(obj.getProperty("Upload_pic_button"))).click();
	}
	
	catch(Exception e) {      
        System.out.println(e);     
         ss sc = new ss();
         sc.takeScreenshot(dr);
	}
	}
}