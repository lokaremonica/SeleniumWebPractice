package Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Software\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		String b1 = "//h1[contains(text(),'Block 1')]";
				//"//h1[text()='Block 1']";
      WebElement source = driver.findElement(By.xpath(b1));
      String b2 = "//h1[contains(text(),'Block 4')]";
    		  //"//h1[text()='Block 4']";
      WebElement dest = driver.findElement(By.xpath(b2));
     Actions act = new Actions(driver);
     act.dragAndDrop(source, dest).perform();
	}

}
