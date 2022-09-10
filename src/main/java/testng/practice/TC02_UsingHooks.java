package testng.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02_UsingHooks extends TestNG_Hooks {

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
		WebElement OpportunitiesSearch = driver.findElement(By.xpath("//input[@class='slds-input']"));
		OpportunitiesSearch.sendKeys("Salesforce Automation by Muthu2", Keys.ENTER);
		// Thread.sleep(10000);
		// OpportunitiesSearch.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table/tbody/tr/td[8]/span/div/a")).click();
		// driver.findElement(By.xpath("//a[@title='Show 3 more actions']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(5000);
		String text = driver
				.findElement(By.xpath("//lightning-formatted-rich-text[@class='slds-rich-text-editor__output']/span"))
				.getText();
		System.out.println(text);

	}

}
