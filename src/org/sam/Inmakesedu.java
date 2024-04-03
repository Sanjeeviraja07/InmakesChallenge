package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inmakesedu {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\SANJU\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://inmakesedu.com/");
		
		driver.manage().window().maximize();
		
		WebElement lear = driver.findElement(By.xpath("//h1[text()='Learning Today For A Better Tomorrow']"));
		String text = lear.getText();
		System.out.println(text);
		
		WebElement forh = driver.findElement(By.xpath("//p[contains(text(),'for your')]"));
		String text2 = forh.getText();
		System.out.println(text2);
		
		WebElement forh1 = driver.findElement(By.xpath("(//p[contains(text(),'We are')])[1]"));
		String text3 = forh1.getText();
		System.out.println(text3);
		
		//driver.close();
		
	}

}
