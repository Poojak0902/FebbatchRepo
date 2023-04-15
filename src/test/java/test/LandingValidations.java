package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingValidations extends Base {
 
	
	
	@Test(priority = 2)
  public void Validatetitle() {
  
	String actualtitle = driver.getTitle();
	String expectedtitle="Facebook - log in or sign up";
	Assert.assertTrue(actualtitle.equals(expectedtitle), "title is not as expected >>"+ actualtitle);
	}



	@Test(priority = 1)
  public void ValidaeURL() {
  
	String actualurl = driver.getCurrentUrl();
	String expecteurl="https://www.facebook.com/";
	Assert.assertTrue(actualurl.contains(expecteurl), "title is not as expected >>"+ actualurl);
	}


}
