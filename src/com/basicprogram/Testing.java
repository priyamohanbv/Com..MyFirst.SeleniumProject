package com.basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver;
	     
	     //Setting webdriver.gecko.driver property
	     System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     
	     //Instantiating driver object and launching browser
	     driver = new ChromeDriver();
	     
	     //Using get() method to open a webpage
	     driver.get("https://amazon.com");
	     
	     //WebElement emailidText = driver.findElement(By.id("email"));
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Trimmer for men");
	     driver.findElement(By.id("nav-search-submit-button")).click();
	     driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
	     driver.findElement(By.linkText("Price: High to Low")).click();
	     
	}

}
