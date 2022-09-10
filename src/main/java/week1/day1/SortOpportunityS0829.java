package week1.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortOpportunityS0829 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
				driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("India$321");
		driver.findElement(By.id("Login")).submit();
		Thread.sleep(10000);
		// options.addArguments("--disable-notifications");
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
		driver.navigate().refresh();
		Thread.sleep(10000);
		String Link = driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[2]")).getText();
		// driver.findElement(By.xpath("//*[@class='slds-icon slds-icon-text-default
		// slds-icon_x-small']")).click();
		System.out.println(Link);
		WebElement m =driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[2]"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", m);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='All Opportunities']")).click();
		Thread.sleep(10000);
		String currentdate = driver.findElement(By.xpath("//table/tbody/tr/td[5]/span/span/span")).getText();
		System.out.println("current date=" + currentdate);
		driver.findElement(By.xpath("//span[text()='Close Date']")).click();
		Thread.sleep(5000);
		String sortdate = driver.findElement(By.xpath("//table/tbody/tr/td[5]/span/span/span")).getText();
		System.out.println("sorted date=" + sortdate);
		driver.findElement(By.xpath("//span[text()='Close Date']")).click();
		Thread.sleep(5000);
		String sortedagaindate = driver.findElement(By.xpath("//table/tbody/tr/td[5]/span/span/span")).getText();
		System.out.println("sortedagain date=" +sortedagaindate);
		if (currentdate.equalsIgnoreCase(sortedagaindate))
		{
			System.out.println("sort is working fine");
		}
		Thread.sleep(5000);
		List <WebElement> datelist = driver.findElements(By.xpath("//table/tbody/tr/td[5]/span/span/span"));
		System.out.println(datelist.size());
		List <WebElement> datelist1 = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		System.out.println(datelist1.size());
		
		
		
		
	}

}
