package CromeOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions opt=new ChromeOptions();
        //opt.addArguments("start-maximized");
        //opt.addArguments("incognito");
        //opt.addArguments("headless");
        //opt.addArguments("disable-notification");
        
        List<String> s=new ArrayList<>();
        s.add("start-maximized");
        s.add("incognito");
        s.add("--disable-notifications");
        opt.addArguments(s);
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.get("https://www.ajio.com/?gclid=Cj0KCQjwrfymBhCTARIsADXTabmALNqPINUQcnY5UjMygIfCdOw60bWBjCJ9Peq9iqi5M15Jwm3VLpUaAp1SEALw_wcB");
		
	}

}
