package mavenJenkins;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class UITest {

	WebDriver driver;
	@Test
	void firstFunc() {
		System.out.println("hello!!!!!!");
	}

	

	@Test
	public void verifyTitle() {
	// //WebDriverManager.chromedriver().setup();
	// ChromeOptions options=new ChromeOptions();
	// options.addArguments("headless");
	// driver=new ChromeDriver(options);
	// driver.get("https://www.browserstack.com/");
	// System.out.println("Title is: " +driver.getTitle());
	// Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	// driver.quit();
		
	  
		// Disable Selenium Manager auto-downloads
        System.setProperty("SE_DISABLE_DRIVER_DOWNLOAD", "true");

        // Point to the pre-downloaded EdgeDriver
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");

        EdgeOptions options = new EdgeOptions();
        // For modern Edge, "--headless=new" is preferred; fallback to "--headless" if needed
        options.addArguments("--headless=new", "--no-sandbox", "--disable-dev-shm-usage");

        driver = new EdgeDriver(options);
        driver.get("https://www.browserstack.com/");
        String title = driver.getTitle();
        System.out.println("Title is: " + title);

        Assert.assertEquals(title,
                "Most Reliable App & Cross Browser Testing Platform | BrowserStack");

        driver.quit();


	}

}
