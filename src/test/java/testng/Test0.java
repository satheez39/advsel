package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test0 {
	@Test
	public void demo() throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window() .maximize(); 
		driver.get("https://www.facebook.com/"); 
		driver.manage().timeouts(). implicitlyWait(10,TimeUnit. SECONDS);
		
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl()); 
		driver.close();
	}

}
