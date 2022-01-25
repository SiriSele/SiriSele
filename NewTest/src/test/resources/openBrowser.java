import org.openqa.selenium.WebDriver;

public class openBrowser {
	
	@Test
	public void browserLogin()
	{
		WebDriverManager.chromedriver.setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		diver.get("http:www.google.com")
	}

}
