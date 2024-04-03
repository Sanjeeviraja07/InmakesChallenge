package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("sanjeeviraja53@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("12345");
		
		//WebElement loginbt = driver.findElement(By.xpath("//button[@type='submit']"));
		//loginbt.click();
		
		//WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		//forgot.click();
		
		WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create.click();
	}

}
