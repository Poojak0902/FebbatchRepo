package driverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

public static WebDriver driver;
	//Launch the browser
		public void setup(String browser, String url) {
			//getting the user directory dynamically
			String path = System.getProperty("user.dir");
			System.out.println(path);
			
			if (browser.equalsIgnoreCase("chrome")) {
				//browser is launched 
				System.setProperty("webdriver.chrome.driver", path+"\\driver\\chromedriver.exe");
				driver=new ChromeDriver();
				System.out.println("This is chrome driver"+ browser);	
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", path+"\\driver\\geckodriver.exe");
				driver=new FirefoxDriver();
				System.out.println("This is firefox driver  "+ browser);	
			}else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", path+"\\driver\\msedgedriver.exe");
				driver=new EdgeDriver();
				System.out.println("This is Edge driver  " + browser);	
			}else {
				System.out.println("No browser is called or Invalid Broswr name>> "+ browser);
			}
			
		//MAximaizze the browser
			driver.manage().window().maximize();
			
			
		//command to launch the url
		if (url!="") {
			driver.get(url);
			System.out.println("This is launched Url >> "+ url);
		}else {
			driver.get("about:blank");
			System.out.println(" The url value is blank");
		}
		//implicit wiat 	>> global wait at page level
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.close();
		}


		public void teardown() {
			driver.quit();
		}
		
		public static WebDriver  getdriver() {
		
			return driver;
			
			
		}


}
