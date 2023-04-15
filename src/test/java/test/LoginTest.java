package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.LoginAction;

public class LoginTest extends Base {
	
	
	LoginAction login;
 
	
	@BeforeClass(alwaysRun = true )
	public void Beforeclass() {
		 login = new LoginAction(driver);
	}
	
	
	@Parameters({"ValidUN", "ValidPW"})
	@Test(priority = 3, groups= {"Regression"})
  public void validateUN(String un, String pw) {
		
	Assert.assertTrue(login.userName.isDisplayed(),"UN fields is not created or emabled");	
	Assert.assertTrue(login.userName.isEnabled(),"UN fied is not enabled");	
	login.sendkeysfeild(login.userName, un);
	
	Assert.assertTrue(login.lastName.isDisplayed(),"last fields is not created or emabled");	
	Assert.assertTrue(login.lastName.isEnabled(),"last fied is not enabled");	
	login.sendkeysfeild(login.lastName, pw);
	
	
  }
	@Parameters({"inValidUN", "ValidPW"})
	@Test(priority = 4)
  public void invalidUNValidPW(String un, String pw) {
		
	Assert.assertTrue(login.userName.isDisplayed(),"UN fields is not created or emabled");	
	Assert.assertTrue(login.userName.isEnabled(),"UN fied is not enabled");	
	login.sendkeysfeild(login.userName, un);
	
	Assert.assertTrue(login.lastName.isDisplayed(),"last fields is not created or emabled");	
	Assert.assertTrue(login.lastName.isEnabled(),"last fied is not enabled");	
	login.sendkeysfeild(login.lastName, pw);
	
	
  }
	
	@Parameters({"ValidUN", "inValidPW"})
	@Test(priority = 5, groups= {"Sanity", "Regression"})
  public void validUNinValidPW(String un, String pw) {
		
	Assert.assertTrue(login.userName.isDisplayed(),"UN fields is not created or emabled");	
	Assert.assertTrue(login.userName.isEnabled(),"UN fied is not enabled");	
	login.sendkeysfeild(login.userName, un);
	
	Assert.assertTrue(login.lastName.isDisplayed(),"last fields is not created or emabled");	
	Assert.assertTrue(login.lastName.isEnabled(),"last fied is not enabled");	
	login.sendkeysfeild(login.lastName, pw);
	
	
  }
	
	@Parameters({"inValidUN", "inValidPW"})
	@Test(priority = 6, groups= {"Smoke"})
  public void invalidUNinValidPW(String un, String pw) {
		
	Assert.assertTrue(login.userName.isDisplayed(),"UN fields is not created or emabled");	
	Assert.assertTrue(login.userName.isEnabled(),"UN fied is not enabled");	
	login.sendkeysfeild(login.userName, un);
	
	Assert.assertTrue(login.lastName.isDisplayed(),"last fields is not created or emabled");	
	Assert.assertTrue(login.lastName.isEnabled(),"last fied is not enabled");	
	login.sendkeysfeild(login.lastName, pw);
	
	
  }
	@Test(priority = 7)
	  public void validateloginbutton() {
			
		Assert.assertTrue(login.loginButton.isDisplayed(),"login fields is not created or emabled");	
		Assert.assertTrue(login.loginButton.isEnabled(),"login fied is not enabled");	
		
		login.click();
	  }
}
