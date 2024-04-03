package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		search.sendKeys("Redmi");
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		
	button.click();
		
	}

}
