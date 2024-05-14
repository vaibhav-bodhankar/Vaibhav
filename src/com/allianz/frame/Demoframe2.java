package com.allianz.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoframe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        
	        driver.get("https://netbanking.hdfcbank.com/netbanking/");
	        
	        driver.switchTo().frame(0);
	        
	        driver.findElement(By.name("fldLoginUserId")).sendKeys("Jack123");
	        //linktest and partiallinktext match the font of html
	        //xpth match the font present in html
	        driver.findElement(By.linkText("CONTINUE")).click();
	        //switch to main html
	        
	        driver.switchTo().defaultContent();
	        

	}

}
