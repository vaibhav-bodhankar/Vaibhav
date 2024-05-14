package com.allianz.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskTwoCitybankSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
		
		driver.findElement(By.linkText("select your product type")).click();
		
		driver.findElement(By.linkText("Credit Card")).click();
		
		driver.findElement(By.name("citiCard1")).sendKeys("11");
		
		driver.findElement(By.name("citiCard2")).sendKeys("22");
		
		driver.findElement(By.name("citiCard3")).sendKeys("33");
		
		driver.findElement(By.name("citiCard4")).sendKeys("44");
		
		driver.findElement(By.name("CCVNO")).sendKeys("123");
		
		driver.findElement(By.name("DOB")).click();
		
		Select selectMonth=new Select(driver.findElement(By.className("ui-datepicker-month")));
		selectMonth.selectByVisibleText("Feb");
		
		Select selectYear=new Select(driver.findElement(By.className("ui-datepicker-year")));
		selectYear.selectByVisibleText("2000");
		
		driver.findElement(By.linkText("12")).click();
		
		driver.findElement(By.xpath("(//input[@class='custom_check terms'])")).click();
		
		driver.findElement(By.xpath("(//input[@value='PROCEED'])")).click();
		
		
		
		
		
		
		
		
		

	}

}
