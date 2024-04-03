package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver"  , "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		/*
		WebElement cli = driver.findElement(By.xpath("//span[text()='Account']"));
		cli.click();
		
		WebElement clic = driver.findElement(By.xpath("//span[text()='Login/ Sign Up']"));
		clic.click();
		
		WebElement phon = driver.findElement(By.xpath("//input[@type='number']"));
		phon.sendKeys("9080130016");
		*/
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("coimbatore");
		
		
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("tirupur");
		
		WebElement clic = driver.findElement(By.xpath("//i[@class='sc-jKJlTe fFQGdj icon-swaparrow']"));
		clic.click();
	}

}
