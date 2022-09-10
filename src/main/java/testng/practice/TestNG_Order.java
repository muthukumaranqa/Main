package testng.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Order {
	WebDriver driver;

	@BeforeSuite
	public void beforesuite() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@BeforeTest
	public void beforetest() {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		
	}

	@BeforeMethod
	public void beforemethod() {
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("India$321");
		driver.findElement(By.id("Login")).submit();

	}

	@Test
	public void Test() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		// Alert alert = driver.switchTo().alert();
		// driver.switchTo().alert().sendKeys("sales");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(15000);
		WebElement Opportunities = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Opportunities);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Muthu3");
		String name = "Salesforce Automation by Muthu3";
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("6/30/2022");
		// driver.findElement(By.xpath("//button[@aria-label='Stage,
		// --None--']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='--None--']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		System.out.println(name);
		// String Opportunitiesname =
		// driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText());
		String Opportunitiesname = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"))
				.getText();
		if (name.equals(Opportunitiesname)) {
			System.out.println("TC is Pass");
		}

	}

	@AfterMethod
	public void Aftermethod() {
		driver.close();
	}

}
