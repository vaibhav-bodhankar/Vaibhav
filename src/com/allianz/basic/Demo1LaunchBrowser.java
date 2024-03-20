package com.allianz.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		String browser="Edge";
		if(browser.equalsIgnoreCase("Ch"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		
			
	//	WebDriver driver1=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver1.get("https://www.google.com/");
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		driver.quit();
	}

}
