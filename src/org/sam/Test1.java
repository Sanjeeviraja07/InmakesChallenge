package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		email.sendKeys("sanjeeviraja53@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		pass.sendKeys("12345");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
	}
}
