package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	 WebElement inmakes = driver.findElement(By.xpath("//textarea[@type='search']"));
	 inmakes.sendKeys("inmakes learning hub");
	 WebElement search = driver.findElement(By.xpath("(//input[@value='Google Search'])[1]"));
	 search.click();
      WebElement link = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
      link.click();
	
	
	}
}



