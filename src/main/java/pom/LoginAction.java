package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverManager;
import utils.CommonMethod;

public class LoginAction {

//PAGE object model
	
	WebDriver driver;
	CommonMethod common = new CommonMethod(DriverManager.getdriver());
	

@CacheLookup
@FindBy(id="email")
public
WebElement userName;

@CacheLookup
@FindBy(id="pass")
public WebElement lastName;

@CacheLookup
@FindBy(name="login")
public WebElement loginButton;


public LoginAction(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver,this);
}





public void sendkeysfeild(WebElement ele, String keys ) {
	common.higlightelement(ele );
	ele.clear();
	ele.sendKeys(keys);
	System.out.println("This is demo for git push");
}

public void click() {
	common.higlightelement(loginButton);
	common.waitforElement(loginButton);
	loginButton.click();
}


}
