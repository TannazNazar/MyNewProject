package com.syntax.practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {

	

	@Test
	public void setUp() {
	WebDriver driver= new ChromeDriver();
	driver.get("http://google.com");
	
	}
}
