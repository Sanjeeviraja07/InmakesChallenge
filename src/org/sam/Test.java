package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		/*WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("sanjeeviraja53@gmail.com");
		*/
		driver.findElement(By.id("email")).sendKeys("sanjeeviraja@gmail.com");
		WebElement element2 = driver.findElement(By.name("pass"));
		element2.sendKeys("12345");
		
		WebElement element3 = driver.findElement(By.name("login"));
		element3.click();
	}

}
