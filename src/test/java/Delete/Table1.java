package Delete;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table1 {

	public static void main(String[] args) 
	{
	  System.setProperty("WebDriver.chrome.driver","G:\\Setups\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions opt=new ChromeOptions();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/web-table-element.php");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
	  int total_no_row = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr")).size();
	  System.out.println("Total NO.of row is = "+total_no_row);
	  
	  
	  int total_no_column = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//th")).size();
	  System.out.println("Total No.of coloumn is = "+total_no_column);
	  
	  


	}

}
