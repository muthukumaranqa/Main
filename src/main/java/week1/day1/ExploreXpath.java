package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExploreXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Normal Xpath
		driver.findElement(By.xpath("//input[@id='username']"));
		//Parent to Child by Tag
		driver.findElement(By.xpath("//p[@class='top']/input"));
		//Parent to Child by xpath
		driver.findElement(By.xpath("//p[@class='top']/input[@id='username']"));
		//Grandparent to Child by Tag
		driver.findElement(By.xpath("//div[@id='form']//input"));
		//Grandparent to Child by xpath
		driver.findElement(By.xpath("//div[@id='form']//input[@id='username']"));
		//Elder Cousin to Younger Cousin by Tag
		driver.findElement(By.xpath("//input[@id='username']/following::input"));
		//Elder Cousin to Younger Cousin by Xpath
		driver.findElement(By.xpath("//label[@for='username']/following::input[@id='password']"));
		//Elder Sibling to Younger Sibling by Tag
		driver.findElement(By.xpath("//label[@for='username']/following-sibling::input"));
		//Elder Sibling to Younger Sibling by Xpath
		driver.findElement(By.xpath("//label[@for='username']/following-sibling::input[@id='username']"));
				
		
		
		

	}

}
