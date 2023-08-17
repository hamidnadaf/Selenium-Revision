package Unregulated_List;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unregulated_List {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("gadar");

	    List<WebElement> Search_Result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		Thread.sleep(2000);

	    for(WebElement a:Search_Result)
		 {
	    	System.out.println(a.getText());
		 }
	    
	    
	    for (WebElement a:Search_Result)
	    {
		    String expected_Result="gadar 2 review";

		    if(expected_Result.equals(a.getText()))
		    		{
		    	a.click();
		    	break;
		    		}
	    }
	    
	}

}
