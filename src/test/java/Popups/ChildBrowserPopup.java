package Popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Demo.Webdriver_Methods;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Set<String> ids = driver.getWindowHandles();
        ArrayList<String> al=new ArrayList(ids);
        String main_pageid=al.get(0);
        String child_pageid=al.get(1);
        driver.switchTo().window(child_pageid);
        driver.manage().window().maximize();
        driver.close();
        driver.switchTo().window(main_pageid);
        driver.manage().window().maximize();


		
	}

}
