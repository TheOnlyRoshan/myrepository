package com.facebook.utils;

import java.io.File;
import java.util.Calendar;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.facebook.testcases.SuperFB;
import org.apache.commons.io.FileUtils; 

public class ss extends SuperFB {
	
	public void takeScreenshot(WebDriver drvr) throws Exception {  
		int rightNowHour = Calendar.getInstance().get(11);
		int rightNowMin = Calendar.getInstance().get(12);
		int rightNowsec = Calendar.getInstance().get(13);
		int rightNowMonth = Calendar.getInstance().get(2);
		int rightNowDate = Calendar.getInstance().get(5);
		int rightNowYear = Calendar.getInstance().get(1);
		
		String dateFormat = new String(rightNowYear+"-"+rightNowMonth+"-"+rightNowDate+" "+rightNowHour+"_"+rightNowMin+"_"+rightNowsec);
		System.out.println("Taking Screenshot  "+dateFormat);
		File f = ((TakesScreenshot)drvr).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File("C:\\Users\\Roshan\\Downloads\\Selenium\\Screenshots and Recordings\\ss "+dateFormat+".png")); 
        }

}
