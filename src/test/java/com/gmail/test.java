package com.gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gmail.home;
import com.gmail.login;

public class test {
	WebDriver driver;
	
	@BeforeTest
	public void login() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\neon\\Gmail\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
	}
		
	@Test
	public void method() throws InterruptedException{	
		login l =new login(driver);
		l.username().sendKeys("vivekkoreqa7");
		l.nextbtu().click();
		Thread.sleep(2000);
		l.password().sendKeys("20112015");
		l.nextbtp().click();
		System.out.println(driver.getTitle());
		
		
		home h =new home(driver);
		Thread.sleep(5000);
		h.account().click();
		Thread.sleep(5000);
		h.logout().click();
		System.out.println(driver.getTitle());
		
	}
	
	@AfterTest
	public void teardown(){
		driver.close();
	}
}
