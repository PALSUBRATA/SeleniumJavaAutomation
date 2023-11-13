package com.pal.lab;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManagerUsing {

	public static void main(String[] args) {
		
		String url ="https://chromedriver.chromium.org/downloads";
	
		
		WebDriverManager.chromedriver().setup();
		//initializing the driver
		WebDriver driver = new ChromeDriver();
		//navigate to the url
		driver.get(url);
		
	}
}
