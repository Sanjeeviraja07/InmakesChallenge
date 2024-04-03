package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inmakesedu1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://inmakesedu.com/about_us");
		
		driver.manage().window().maximize();
		
		WebElement lea = driver.findElement(By.xpath("//h2[contains(text(),'learning hub')]"));
		String text = lea.getText();
		System.out.println(text);
		
		WebElement sof = driver.findElement(By.xpath("//p[contains(text(),'software solutions')]"));
		String text2 = sof.getText();
		System.out.println(text2);
		
		WebElement hund = driver.findElement(By.xpath("//p[contains(text(),'hundreds')]"));
		String text3 = hund.getText();
		System.out.println(text3);
		
		WebElement wide = driver.findElement(By.xpath("//p[contains(text(),'wide')]"));
		String text4 = wide.getText();
		System.out.println(text4);
		
		
	}

}
