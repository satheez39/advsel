package chromeoption;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test
	public void demo() {
	ChromeOptions options=new ChromeOptions();
	//options.addArguments("start-maximized");
	options.addArguments("--version");
	//options.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(options);
	
	
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	driver.close();

}
}
