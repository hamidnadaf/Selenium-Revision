package Teble_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		// NO.of Rows
		
		int number_of_Rows = driver.findElements(By.xpath("//table[@Class='dataTable']//tr")).size();
		System.out.println("Number of Rows = "+number_of_Rows);
		
		//No.of Columns
		
		int number_of_Column = driver.findElements(By.xpath("//table[@Class='dataTable']//tr//th")).size();
		System.out.println("Number of Column = "+number_of_Column);
		
		//Printing Header
		
        for(int i=1;i<=number_of_Column;i++)
        {
        	String header = driver.findElement(By.xpath("//table[@Class='dataTable']//tr[1]//th["+i+"]")).getText();
        	Thread.sleep(1000);
        	System.out.print(header+" ");
        }
        System.out.println();
        
        //Printing data of hole table
        for(int i=1;i<=number_of_Rows-1;i++)
        {
        	for(int j=1;j<=number_of_Column;j++)
        	{
            	String data = driver.findElement(By.xpath("//table[@Class='dataTable']//tr["+i+"]//td["+j+"]")).getText();
                Thread.sleep(100);
            	System.out.print(data+" ");
        	}
        	System.out.println("");
        }
        driver.close();
	}

}
