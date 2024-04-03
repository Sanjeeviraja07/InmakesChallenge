package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
			
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement cli = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		cli.click();
		
		WebElement clic = driver.findElement(By.xpath("//img[@alt='ce3 lite']"));
		clic.click();
	}
	
	

}
