package net.larrystaubin.capabilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverNavigate {
	public static void main (String...args){
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium WebDriver");
		
		
		WebElement searchButton = driver.findElement(By.name("btnG"));
		searchButton.click();
		
		searchBox.clear();
		
		searchBox.sendKeys("Ruby on Rails");
		searchButton.click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
			
	}

}
