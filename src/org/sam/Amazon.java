package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone");
		
		WebElement searchbt = driver.findElement(By.id("nav-search-submit-button"));
		searchbt.click();
		
		//WebElement sear = driver.findElement(By.xpath("//input[@type='text']"));
		//sear.sendKeys("iphone");
		
		//WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		//submit.click();
	}

}
