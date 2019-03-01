package jenkins;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

public class JenkinsTestsTaskOneAndTwo {
	
	WebDriver driver;

	@Before
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", Constants.driver);
	driver = new ChromeDriver();
	
	//String url = Constants.url;	
	}
	
	
	@After
	public void teardown() {
		driver.close();
	}
	
	
	@Test
	public void taskOne() throws InterruptedException {
		
		driver.get(Constants.url);
		LoginPage log =PageFactory.initElements(driver, LoginPage.class);
		log.logIn();
		Thread.sleep(2000);
	
		HomePage item = PageFactory.initElements(driver, HomePage.class);
		item.createItem();
		Thread.sleep(2000);
		NewItemPage create = PageFactory.initElements(driver, NewItemPage.class);
		create.enter();
		Thread.sleep(2000);
		ItemDetails save = PageFactory.initElements(driver, ItemDetails.class);
		save.saved();
		Thread.sleep(5000);
		ItemCreated back = PageFactory.initElements(driver, ItemCreated.class);
		back.dash();
		Thread.sleep(3000);
		item.checkItemAdded();
		assertEquals("item not found", true, true);
	
	}
	
	@Test
	public void taskTwo() {
		driver.get(Constants.url);
		
		ManagePage manage = PageFactory.initElements(driver,ManagePage.class);
		manage.click();
		UserPage page = PageFactory.initElements(driver, UserPage.class);
		page.add();
		
	
	}
}

