package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("search_query"));
		search.sendKeys("india");
		
		WebElement sear = driver.findElement(By.id("search-icon-legacy"));
		sear.click();
		
		
		//WebElement sear1 = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		//sear1.click();
		
		
	}
	
}
