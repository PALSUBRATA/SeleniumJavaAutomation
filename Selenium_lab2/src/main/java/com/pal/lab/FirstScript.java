package com.pal.lab;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstScript {

	public static void main(String[] args) {
		
		String chromeDriverPath= "C:\\Users\\subra\\git\\SeleniumJavaAutomation\\Selenium_lab2\\chromedriver.exe";
		String url ="https://chromedriver.chromium.org/downloads";
	
		//setting up system property for browser
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		//initializing the driver
		WebDriver driver = new ChromeDriver();
		//navigate to the url
		driver.get(url);
	}
}
