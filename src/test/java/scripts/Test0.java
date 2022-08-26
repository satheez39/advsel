package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test0 {

	
	@Test
	public void demo(){
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver. get("https://www.amazon.com");
	System. out. println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();

	}
}
