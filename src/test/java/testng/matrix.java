package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class matrix {
	@DataProvider
	 public Object[][] getData() {
		Object[][] a=new Object[3][2]; 
		a[0][0]="qwerty"; 
		a[0][1]="qewrerty";
		a[1][0]="124865678"; 
		a[1][1]="1265678";
		a[2][0]="retnj565898g#@$#%"; 
		a[2][1]="54m1m8978*&^%%"; 
		return a;
	 }
		@Test(dataProvider="getData")
		public void tcl(String user,String pass) 
		{ 
			WebDriverManager.chromedriver().setup(); 
			WebDriver driver=new ChromeDriver(); 
			driver.manage().window().maximize(); 
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys(user); 
			driver.findElement(By.name("pass")).sendKeys(pass);
			driver.findElement(By.name("login")).click(); 
			driver.close();
		}

		

}
