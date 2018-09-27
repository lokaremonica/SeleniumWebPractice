package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertnconf {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.services.irctc.co.in/homebody.html");
		driver.findElement(By.id("button")).click();
		Alert aert = driver.switchTo().alert();
		System.out.println(aert.getText());
		aert.accept();
	}

}
