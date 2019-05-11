package pageObjectDemo;

import static org.junit.jupiter.api.Assertions.*;

import WebPages.PageFactoryGoogle;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import io.github.bonigarcia.seljup.SeleniumExtension;
import org.openqa.selenium.chrome.ChromeDriver;


@ExtendWith(SeleniumExtension.class)
public class PageObjectFindByGoogleTest {

    private static WebDriver driver;

	public PageObjectFindByGoogleTest(ChromeDriver driver) {
		this.driver = driver;
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
