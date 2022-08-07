package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasis {
	public static void main(String[] args) {
		System.out.println("Automation");
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\TestLeaf\\Selenium\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VV");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Druva");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muthu");
		// driver.findElement(By.className("submitButton")).click();
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel = new Select(sourceDropdown);
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		sel.selectByIndex(3);
		// Another way to select Dropdown values
		sourceDropdown.sendKeys("Employee");
		WebElement firstSelectedOption1 = sel.getFirstSelectedOption();
		System.out.println(firstSelectedOption1.getText());
		List<WebElement> options = sel.getOptions();
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}

	}
}
