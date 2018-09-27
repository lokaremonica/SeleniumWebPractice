package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
      FirefoxDriver driver = new FirefoxDriver();
      driver.get("https://www.yatra.com/");
      String xp = "//a[@class='dropdown-toggle'][contains(text(),'Support')]";
     WebElement el = driver.findElement(By.xpath(xp));
     Actions sc = new Actions(driver);
     sc.moveToElement(el).perform();
     driver.findElement(By.linkText("Contact Us")).click();;
	}

}
