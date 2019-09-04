package com.facebook.testcases;
import com.facebook.utils.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.facebook.utils.loginn;
public class login extends SuperFB {
	
	WebDriver loginnDriver;
	
	@Test
	public void takeinput() {
		try {
		loginn l1 = new loginn();
		loginnDriver = l1.takeinput(dr);
		
		ss sc = new ss();
		sc.takeScreenshot(loginnDriver);
        System.out.println("Element was found");  
		}
		catch(Exception e) {  
			ss sc = new ss();
			try {
				sc.takeScreenshot(loginnDriver);
				System.out.println("Element Not Found1");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
                  
}
}}