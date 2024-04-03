package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inmakesedu2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://inmakesedu.com/");
		
		driver.manage().window().maximize();
		
		WebElement dubai = driver.findElement(By.xpath("//a[contains(text(),'Mai')]"));
		String text = dubai.getText();
		System.out.println(text);
		
	}

}
