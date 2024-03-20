package com.allianz.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5FBSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		//click on create new account
        //findElement -> Check the presence of element in 0.5 sec
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//enter first name as john
		driver.findElement(By.name("firstname")).sendKeys("Jack");
		
		driver.findElement(By.name("lastname")).sendKeys("mark");
	
		driver.findElement(By.name("reg_email__")).sendKeys("jackmark@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jackmark@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("jackmark@1234");
		
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("14");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Apr");
		
		
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2000");
//		driver.findElement(By.name("birthday_day")).sendKeys("6");
//		
//		driver.findElement(By.name("birthday_month")).sendKeys("12");
//		
//		driver.findElement(By.name("birthday_year")).sendKeys("1995");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
//		
	   // driver.findElement(By.name("sex")).click();
	    
	    driver.findElement(By.name("websubmit")).click();
//		
	
	}

}
