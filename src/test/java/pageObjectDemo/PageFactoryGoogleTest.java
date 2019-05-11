package pageObjectDemo;

import static org.junit.jupiter.api.Assertions.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import WebPages.PageFactoryGoogle;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageFactoryGoogleTest {

    private static WebDriver driver;
		
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() throws Exception {
		PageFactoryGoogle googlePage = PageFactory.initElements(driver, PageFactoryGoogle.class);
		googlePage.search("Mateusz Miotk");
		assertTrue(googlePage.assertTitle());
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}



}
