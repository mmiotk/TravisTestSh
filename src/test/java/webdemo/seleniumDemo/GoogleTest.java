package webdemo.seleniumDemo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleTest {
	
	private static WebDriver driver;

	@BeforeAll
	public static void setUpDriver(){
		//System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		driver = new ChromeDriver();
		// Implicity wait -> max czas na znalezienie elementu na stronie
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeEach
	public void setUp() throws Exception {
		driver.get("https://google.pl/");
	}

	@AfterAll
	public static void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testTitlePage() {
    	assertEquals("Google", driver.getTitle());
	}

}
