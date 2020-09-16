package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
	
  @Test
  public void secondmethod() throws Exception{
	  
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/insurance/v1/register.php");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("user_firstname")).sendKeys("automation");
	  Thread.sleep(3000);
	  
	  driver.quit();
	  

  }
}
