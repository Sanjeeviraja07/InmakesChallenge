package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.xpath("//input[@title='From station']"));
		from.sendKeys("Chennai");
		
		WebElement to = driver.findElement(By.xpath("//input[@title='To station']"));
		to.sendKeys("Tiruppur");
		
	WebElement select = driver.findElement(By.xpath("//select[@title='Class']"));
		select.sendKeys("Second Sitting (2S)");

		WebElement date = driver.findElement(By.xpath("//input[@title='Journey date']"));
		date.sendKeys("25/01/2024");
		
		
		
		
		
		WebElement Search = driver.findElement(By.xpath("//button[@type='submit']"));
		Search.click();
	}

}
