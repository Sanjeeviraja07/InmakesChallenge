package org.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		String PageTitle = driver.getTitle();
		System.out.println(" Current Page Title : " + PageTitle);
		
		String CurrentUrl = driver.getCurrentUrl();
		
		System.out.println(" Current Page Url : " + CurrentUrl);
		
		//driver.close();
		
		
		
		//driver.quit();
	}
	

}
