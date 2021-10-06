package com.udemyExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//select[contains(@id,'destination')]")).click();
		Thread.sleep(4000);
		 driver.findElement(By.xpath("//div[contains(@id,'destination')]//a[contains(text(),'Adampur')]")).click();
		/*input[@id='ctl00_mainContent_ddl_originStation1_CTXT']
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")).click();
		////select[@id='ctl00_mainContent_ddl_destinationStation1']/child::option[@value='BHO'] for arrival
*/
	}

}
