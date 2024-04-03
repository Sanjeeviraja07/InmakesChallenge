package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'people in')]"));
		String text = ele.getText();
		System.out.println(text);
		
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
		create.click();
	}

}
