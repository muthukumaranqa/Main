package testng.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_UsingHooks extends TestNG_Hooks {

	@Test
	public void run() throws InterruptedException {
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

	@Test(dataProvider = "data")
	public void data(String name) throws InterruptedException {
		System.out.println(name);

	}
}
