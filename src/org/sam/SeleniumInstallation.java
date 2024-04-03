package org.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInstallation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		String Pagetitle = driver.getTitle();
		System.out.println("Page of Title : " + Pagetitle);
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("Current Page Url : " + CurrentUrl);
		
		//driver.close();
		
		//driver.quit();
	}
	
	
}
