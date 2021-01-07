package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class basetest implements autocon {

 	public WebDriver driver;
	
 	 @BeforeSuite
 	 
	public void open() {
		
		System.setProperty(chrome_key, chrome_value);	
		driver=new ChromeDriver();
		driver.get(url);
	}
 	 
 	/* @AfterSuite
 	 public void close() {
 		 
 		 driver.quit();
 	 }
	*/
	
}
