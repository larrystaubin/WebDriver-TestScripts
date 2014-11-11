package com.larrystaubin.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndReleaseOnWebElement {
	public static void main(String...args){
		WebDriver driver = new FirefoxDriver();
		driver.get("file://C://Sortable.html");
		WebElement three = driver.findElement(By.name("three"));
		WebElement two = driver.findElement(By.name("two"));
		Actions builder = new Actions(driver);
		builder.clickAndHold(three).release(two).perform();
		
		
		
		
		
		
		
		
	}

}
