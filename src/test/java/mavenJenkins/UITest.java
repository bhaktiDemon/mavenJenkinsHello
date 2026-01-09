package mavenJenkins;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class UITest {

	WebDriver driver;
	@Test
	void firstFunc() {
		System.out.println("hello!!!!!!");
	}

	

	@Test
	public void verifyTitle() {
	//WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("headless");
	driver=new ChromeDriver(options);
	driver.get("https://www.browserstack.com/");
	System.out.println("Title is: " +driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	driver.quit();
	}

}
