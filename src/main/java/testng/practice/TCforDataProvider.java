package testng.practice;

import org.testng.annotations.Test;

public class TCforDataProvider extends TestNG_Hooks{
	@Test(dataProvider = "data")
	public void data(String name) throws InterruptedException {
		System.out.println(name);

	}
}
