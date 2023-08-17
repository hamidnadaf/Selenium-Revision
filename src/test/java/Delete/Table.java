package Delete;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		int total_no_row = driver.findElements(By.xpath("(//table[@class=\"dataTable\"])//tr")).size();
		System.out.println("total no of row = "+total_no_row);
		
		int total_no_column = driver.findElements(By.xpath("(//table[@class=\"dataTable\"])//tr//th")).size();
		System.out.println("total no of column = "+total_no_column);
		
		for(int i=1;i<=total_no_column;i++)
		{
			String header = driver.findElement(By.xpath("(//table[@class=\"dataTable\"])//tr[1]//th["+i+"]")).getText();
			System.out.print(header +" ");
		}
		System.out.println();

		
		for(int i=1;i<=total_no_row-1;i++)
		{
			for(int j=1;j<=total_no_column;j++)
			{
				String data = driver.findElement(By.xpath("(//table[@class=\"dataTable\"])//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(" "+data+" ");
			}
			System.out.println();
		}
		
	}

}
