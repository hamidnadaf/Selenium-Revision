package Dimention_Position_Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("hamid");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("@gmail");
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("hamid");

		Dimension d=new Dimension(400,500);
		driver.manage().window().setSize(d);
		
		Point p=new Point(400,300);
		driver.manage().window().setPosition(p);
				
		
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		Select s=new Select(day);
		s.selectByValue("6");
		Select s1=new Select(month);
		s1.selectByValue("1");
		Select s2=new Select(Year);
		s2.selectByValue("1997");

	
	}

}
