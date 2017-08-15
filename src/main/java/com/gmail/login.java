package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	WebDriver driver;
	
	public login(WebDriver driver)
	{
		this.driver =driver;
	}
	
	By username = By.id("identifierId");
	By nextbtu = By.xpath(".//*[@id='identifierNext']/div[2]");
	By password = By.xpath("//input[@name='password']");
	By nextbtp =By.xpath(".//*[@id='passwordNext']/div[2]");
	
	
	public WebElement username(){
		return driver.findElement(username);
	}
	
	public WebElement nextbtu(){
		return driver.findElement(nextbtu);
	}
	
	public WebElement password(){
		return driver.findElement(password);
	}
	
	public WebElement nextbtp(){
		return driver.findElement(nextbtp);
	}
	

}
