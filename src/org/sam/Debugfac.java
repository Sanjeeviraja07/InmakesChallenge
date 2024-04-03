package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debugfac {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
		create.click();
		
		Thread.sleep(3000);
		
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radio.click();
}
}
