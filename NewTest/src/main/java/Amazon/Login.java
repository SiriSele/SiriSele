package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	//WebDriver driver;
	@Test//(priority = 1)
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","F:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
//	@Test(priority = 2)
//	public void teardown()
//	{
//		driver.close();
//	}
	
	
}
