package Simple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Time 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	   FirefoxDriver ww = new FirefoxDriver();
	   ww.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   ww.get("https://Google.com");
	   ww.navigate().to("https://demo.actitime.com/login.do");
	   ww.findElement(By.id("username")).sendKeys("admin");
	   ww.findElement(By.name("pwd")).sendKeys("manager");
	   ww.findElement(By.name("pwd")).sendKeys(Keys.RETURN);	
	   //Explicit wait
	  WebDriverWait wait = new WebDriverWait(ww,10);
	   wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		ww.findElement(By.id("logoutLink")).sendKeys(Keys.ENTER);;
		ww.quit();
}
}
