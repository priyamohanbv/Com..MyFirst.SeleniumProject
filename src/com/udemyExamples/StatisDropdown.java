//   48th class

package com.udemyExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StatisDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		driver.findElement(By.xpath("//option[text()='AED']")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
		*/
		
		WebElement staticDroupDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDroupDown);	
		
		dropdown.selectByIndex(1);
		Thread.sleep(4000);
		dropdown.selectByVisibleText("AED");
		Thread.sleep(4000);
		dropdown.selectByValue("USD");
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		 /* or
		System.out.println(getFirstSelectedOption().getText());
		  */
		
	}

}
