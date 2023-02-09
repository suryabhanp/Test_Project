package com.capita.restassured_fundamentals;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * A simple unit test
 */
public class MainTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	System.out.println("Hello World");
        assertTrue( true );
    }
    
    @Test
    public void shouldAnswerWithTrue1()
    {
		/*
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * driver.get("https://www.google.com/intl/en-GB/gmail/about/"); driver.close();
		 */
    	WebDriverManager.chromedriver().setup();
    	ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--diable--notifications");
		chromeOptions.addArguments("disable-infobars"); 
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://google.com");
    	System.out.println(driver.getTitle());
    	driver.close();
    }
    
}
