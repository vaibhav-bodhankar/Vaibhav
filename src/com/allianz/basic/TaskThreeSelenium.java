package com.allianz.basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskThreeSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd =new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.medibuddy.in/");
		
		//wd.findElement(By.)

	}

}
