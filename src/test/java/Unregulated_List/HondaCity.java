package Unregulated_List;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HondaCity 
{
	public static void main(String[] args) throws InterruptedException 
	{
 		WebDriver driver=new ChromeDriver();
 		driver.get("https://www.google.com/");
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
 		driver.findElement(By.name("q")).sendKeys("honda");
 		List<WebElement> Search_Result = driver.findElements(By.xpath("(//ul[ @class='G43f7e'])[1]/li"));
 		for(WebElement a:Search_Result)
 		{
 			System.out.println(a.getText());
 		}
 		
 		for(WebElement a:Search_Result)
 		{
 			String Expected_Result="honda city";
 			if(Expected_Result.equals(a.getText()))
 			{
 				a.click();
 				break;
 			}
 		}
 		driver.close();
	}
}


