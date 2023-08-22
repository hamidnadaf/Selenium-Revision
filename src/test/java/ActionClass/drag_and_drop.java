package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
	      driver.switchTo().frame(0);

	     WebElement drag= driver.findElement(By.xpath("//p[text()=\"Drag me to my target\"]"));
		Thread.sleep(2000);

	     WebElement drop= driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		Thread.sleep(2000);

		Actions act=new Actions(driver);
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		Thread.sleep(5000);
		System.out.println("K");

		
		
		
	}

}
