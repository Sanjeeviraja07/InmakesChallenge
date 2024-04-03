package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sanjeeviraja53@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123456");
		
		WebElement loginbt = driver.findElement(By.name("login"));
		loginbt.click();
		
	
	}

}
