package assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDashboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("saturn@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Bootcamp$123");
		driver.findElement(By.id("Login")).submit();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement Dashboards = driver.findElement(By.xpath("//a[@title='Dashboards']/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Dashboards);
		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='dashboard']")));
			driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("Muthu_Workout");
		driver.findElement(By.xpath("//input[@id='dashboardDescriptionInput']")).sendKeys("Testing");
		driver.findElement(By.xpath("//button[@id='submitBtn']")).click();
		Thread.sleep(5000);
		WebElement Dashboards1 = driver.findElement(By.xpath("//a[@title='Dashboards']/span"));
		js.executeScript("arguments[0].click();", Dashboards1);
		System.out.println(driver.findElement(By.xpath("//a[@title='Muthu_Workout']")).getText());
		


	}

}
