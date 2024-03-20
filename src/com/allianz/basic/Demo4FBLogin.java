package com.allianz.basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo4FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//enter user name as hello12345@gmail.com
		
		driver.findElement(By.id("email")).sendKeys("hello12345@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("jacl123");
		
		//click on login
		driver.findElement(By.name("login")).click();

	}

}
