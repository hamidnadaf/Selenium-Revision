package ActionClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScrolldownDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.get("https://www.ajio.com/?gclid=Cj0KCQjwrfymBhCTARIsADXTabmALNqPINUQcnY5UjMygIfCdOw60bWBjCJ9Peq9iqi5M15Jwm3VLpUaAp1SEALw_wcB");
        Thread.sleep(3000);
        WebElement image = driver.findElement(By.xpath("//a[text()=\"Pinterest\"]"));
        Actions act=new Actions(driver);
        act.scrollToElement(image).perform();
        
	}

}
