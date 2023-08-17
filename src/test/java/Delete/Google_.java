package Delete;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_ {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("q")).sendKeys("honda");
		 List<WebElement> SearchResult = driver.findElements(By.xpath("(//ul[@class=\"G43f7e\"])[1]/li"));
		 Thread.sleep(2000);
				for(WebElement a:SearchResult)
				{
					System.out.println(a.getText());
					String expectedresult="honda bikes";
					if(expectedresult.equals(a.getText()))
					{
						a.click();
						break;
						
					}
				}
	}

}
