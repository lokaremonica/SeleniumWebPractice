package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
private WebDriver driver;   //global variable

@FindBy(id = "username")
private WebElement unTextBox;
@FindBy(name = "pwd")
private WebElement pwTextBox;
@FindBy(id = "loginButton")
private WebElement loginButton;

public Loginpage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void login(String un, String pwd)
{
	unTextBox.sendKeys(un);
	pwTextBox.sendKeys(pwd);
	loginButton.click();
}
}
