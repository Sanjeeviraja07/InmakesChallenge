package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		login.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		email.sendKeys("sanjeeviraja53@gmail.com");
		
		
	}

}
