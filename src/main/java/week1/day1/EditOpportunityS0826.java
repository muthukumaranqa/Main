package week1.day1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditOpportunityS0826 {

	public static void main(String[] args) throws InterruptedException {
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
		OpportunitiesSearch.sendKeys("Salesforce Automation by Muthu1", Keys.ENTER);
		// Thread.sleep(10000);
		// OpportunitiesSearch.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table/tbody/tr/td[8]/span/div/a")).click();
		// driver.findElement(By.xpath("//a[@title='Show 3 more actions']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		Thread.sleep(5000);
		// find the calendar
		DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.now();
		LocalDate yesterday = localDate.minusDays(1);
		System.out.println(localDate);
		System.out.println(localDate);
		String dateString = FOMATTER.format(localDate);
		String dateStringyesterday = FOMATTER.format(yesterday);
		System.out.println(dateString);
		System.out.println(dateStringyesterday);
		WebElement dateWidget = driver.findElement(By.xpath("//input[@name='CloseDate']"));
		dateWidget.clear();
		dateWidget.sendKeys(dateStringyesterday);
		driver.findElement(By.xpath("//button[@data-value='Needs Analysis']")).click();
		driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("SalesForce");
		driver.findElement(By.xpath("//button[@aria-label='Delivery/Installation Status, --None--']")).click();
		driver.findElement(By.xpath("//span[@title='In progress']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(10000);
		String stage = driver.findElement(By.xpath("//table/tbody/tr/td[5]/span/span")).getText();
		System.out.println(stage);
	}

}
