package com.packt.webdriver.chapter1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Element_TagName {
	public static void main (String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.ca");
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println(buttons.size());
	}

}
