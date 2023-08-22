import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot_Demo {

	public static void main(String[] args) throws IOException, InterruptedException 
	
	{
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      driver.get("https://www.istockphoto.com/photos/kaaba");
      Thread.sleep(200);
      Actions act=new Actions(driver);
      WebElement img = driver.findElement(By.xpath("(//img[@class=\"bOaTkZcdqgXxzJCZECTz\"])[7]"));
      Thread.sleep(2000);
      act.scrollToElement(img).perform();
      File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      File des=new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Yogendra\\src\\test\\java\\ham.png");
      FileHandler.copy(src, des);
      
     
      
      
	}

}
