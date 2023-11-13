package com.pal.lab;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeDriverPath= "C:\\Users\\subra\\git\\SeleniumJavaAutomation\\Selenium_lab2\\chromedriver.exe";
		String url ="https://chromedriver.chromium.org/downloads";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		
		
		

	}

}
