package Delete;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://demo.guru99.com/test/web-table-element.php");  
		  int total_no_ofrow = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr")).size();
		  int totol_no_ofcolumn = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//th")).size();
        
		System.out.println(total_no_ofrow);
		System.out.println(totol_no_ofcolumn);
		
		for(int i=1;i<=totol_no_ofcolumn;i++)
		{
			String header = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr[1]//th["+i+"]")).getText();
			System.out.print(header+" ");
			
		}
		for(int i=2;i<=total_no_ofrow;i++)
		{
			for(int j=1;j<=totol_no_ofcolumn;j++) 
			{
				String data = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr["+i+"]//td["+j+"]")).getText();

				System.out.print(data+" ");
			}
			System.out.println();
		}
		
	}

}
