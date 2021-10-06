package com.testMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("murali");
		driver.findElement(By.name("pass")).sendKeys("lee");
		driver.findElement(By.className("_featuredLogin__formContainer")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();

	}

}
