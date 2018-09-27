package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
private WebDriver driver;

@FindBy(xpath = "/div[@id='popup_menu_settings']//div[@class='popup_beak']")
private WebElement settingslink;
@FindBy(xpath = "//div[@id='popup_menu_addons']//div[@class='popup_beak']")
private WebElement addons;
@FindBy (id= "logoutLink")
private WebElement loglink;

//contructor
public BasePage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

// methods
public void logout()
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	loglink.click();
}
public void add_ons()
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	addons.click();
}
public void settings()
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	settingslink.click();
}
}
