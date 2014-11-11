package net.larrystaubin.capabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {
	public static void main (String...args){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file://C:/Window.html");
		
		String Window1 = driver.getWindowHandle();
		System.out.println("First Window Handle is: " +Window1);
		
		WebElement link = driver.findElement(By.linkText("Google Search"));
		link.click();
		
		String Window2 = driver.getWindowHandle();
		System.out.println("Second Window Handle is " +Window2);
		System.out.println("Number of Window Handles so for: "+driver.getWindowHandles().size());
		
		driver.switchTo().window(Window1);
		
	}

}
