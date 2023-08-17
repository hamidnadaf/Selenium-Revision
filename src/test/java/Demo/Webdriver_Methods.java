package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webdriver_Methods {
  @Test
  public void Test_WebdriverMethod() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.navigate().refresh();
	  driver.getCurrentUrl();
	  Thread.sleep(5000);
	  driver.getTitle();
	  Thread.sleep(5000);
	  driver.quit(); 
  }
}
