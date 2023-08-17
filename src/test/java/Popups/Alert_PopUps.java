package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUps {

	public static void main(String[] args) throws InterruptedException {
         WebDriver driver=new ChromeDriver();
         driver.manage().deleteAllCookies();
         driver.manage().window().maximize();
         driver.get("https://demoqa.com/alerts");
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
         driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
         Thread.sleep(3000);
         Alert alt = driver.switchTo().alert();
         alt.dismiss();
         Thread.sleep(3000);

         driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
         Alert alt1 = driver.switchTo().alert();
         Thread.sleep(3000);

         alt1.sendKeys("ham");
         alt1.accept();
         


         

	}

}
