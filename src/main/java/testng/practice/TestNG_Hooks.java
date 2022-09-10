package testng.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Hooks {

	protected WebDriver driver;

	@BeforeSuite
	public void beforesuite() {
		// TODO Auto-generated method stub
		System.out.println("Test");
	}

//	@Parameters("browser")
//	@BeforeClass
//	public void beforemethod(String browser) {
//		if (browser.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		} else if (browser.equalsIgnoreCase("edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}
//
//	}

	@BeforeMethod
	public void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("India$321");
		driver.findElement(By.id("Login")).submit();

	}

	@DataProvider(name = "data")
	public String[][] getstringtestdata() {
		return new String[][] { { "selenium" }, { "API" } };
	}
	
	@DataProvider(name = "two_data")
	public Object[][] gettestdata() {
		return new Object[][] { { "selenium","42","true" }, { "API","42","false" } };
	}

	@AfterMethod
	public void Afterclass() {
		driver.findElement(By.xpath("//span[@class='uiImage']")).click();
		driver.findElement(By.xpath("//a[@class='profile-link-label logout uiOutputURL']")).click();
	}

	@AfterClass
	public void Aftermethod() {
		driver.close();
	}

}
