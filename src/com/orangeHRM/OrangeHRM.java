package com.orangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
	        
	        driver.findElement(By.name("username")).sendKeys("Admin");
	        
	        driver.findElement(By.name("password")).sendKeys("admin123");
	        
	        driver.findElement(By.xpath("//button[normalize-space( )='Login'] ")).click();
	        
	        driver.findElement(By.xpath("//span[text( )='PIM']")).click();
	        
	        //input[@type='file']
	}

}
