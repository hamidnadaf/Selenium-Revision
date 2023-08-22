package Delete;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	driver.get("https://www.google.co.in/");
	
	driver.findElement(By.name("q")).sendKeys("sportbike");
    List<WebElement> SearchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
    for(WebElement a:SearchResult)
    {
    	System.out.println(a.getText());
    	String expectedResult = "sportbikes in india";
    	if(expectedResult.equals(a.getText()))
    	{
    		a.click();
    		break;
    	}
    }

	}

}
