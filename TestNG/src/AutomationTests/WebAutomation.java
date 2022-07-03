package AutomationTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebAutomation {

	WebDriver driver;
	

	@BeforeTest	
	public void Build() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kamen Dimitrov\\OneDrive\\Documents\\automationEclipse\\chromeDriver103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	}

	
	
	@Test
	public void Test_GetUrl() throws InterruptedException {
		Thread.sleep(5000);
		String title = driver.getCurrentUrl();
		System.out.println(title);

		Assert.assertEquals(title, "https://www.youtube.com/");
	}

	
	
	
	@AfterTest
	public void ShutDown() {
		driver.close();
	}
	
	
	
	
	









}
