package com.allianz.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalseforceAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		//driver.findElement(By.linkText("Try for free")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		
		driver.findElement(By.xpath("(//input[contains(@id,'UserLast')])")).sendKeys("Wick");
		
		//driver.findElement(By.name("UserLastName")).sendKeys("Wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		
		Select selectJobtitle=new Select(driver.findElement(By.name("UserTitle")));
		selectJobtitle.selectByVisibleText("Sales Manager");
		
		//driver.findElement(By.name("UserTitle")).sendKeys();
		
		driver.findElement(By.name("CompanyName")).sendKeys("ABC");
		
		Select selectEmployees=new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmployees.selectByVisibleText("1 - 25 employees");
		//driver.findElement(By.name("CompanyEmployees")).sendKeys("1-25");
		
		driver.findElement(By.name("UserPhone")).sendKeys("8149975772");
		
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
		
		Select selectCountry=new Select(driver.findElement(By.name("CompanyCountry")));
		selectCountry.selectByVisibleText("Barbados");
		driver.findElement(By.name("start my free trial")).click();
	}

}
