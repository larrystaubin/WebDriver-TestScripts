package com.larrystaubin.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchByCSSSelector {
	public static void main (String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.ca");
		WebElement searchButton = driver.findElement(By.cssSelector("#gbqfba"));
		System.out.println(searchButton.getText());
	}
	

}
