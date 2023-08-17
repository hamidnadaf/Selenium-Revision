package Popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.get("https://seleniumsample.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    driver.findElement(By.xpath("//a[text()='Blogger']")).click();
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList(ids);
		String MainPageId= al.get(0);
		String ChildPageId=al.get(1);
		driver.switchTo().window(ChildPageId);
		//driver.getCurrentUrl();
		driver.close();
		
		
		
		
		
		
		
	}

}
