package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteOppurtunityS0827 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		// WebDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("India$321");
		driver.findElement(By.id("Login")).submit();
		Thread.sleep(10000);
		// driver.findElement(By.xpath("//div[@data-aura-rendered-by='439:83;a']")).click();
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
