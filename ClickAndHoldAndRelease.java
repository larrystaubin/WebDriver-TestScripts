package com.packt.webdriver.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndRelease {
	
	public static void main(String...args){
		WebDriver driver = new FirefoxDriver();
		driver.get("file://C:/Sortable.html");
		WebElement three = driver.findElement(By.name("three"));
		Actions builder = new Actions(driver);
		builder.clickAndHold(three).moveByOffset(120, 0).release().perform();
	}
}