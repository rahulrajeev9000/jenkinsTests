package jenkins;

import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JenkinsStepDefinitionsTaskThree {
	
	WebDriver driver;
	
	
	@Before
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	
	//String url = Constants.url;	
	}
	
	
	@After
	public void teardown() {
		driver.close();
	}
	
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
		//Actions action = new Actions(driver);
		LoginPage log =PageFactory.initElements(driver, LoginPage.class);
		log.logIn();
		assertEquals("incorrect url", Constants.url, driver.getCurrentUrl());
	    
	}

	@Given("^the username is present \"([^\"]*)\"$")
	public void the_username_is_present(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		HomePage people = PageFactory.initElements(driver, HomePage.class);
		people.goToPeople();
		UsersPage admin = PageFactory.initElements(driver, UsersPage.class);
		admin.findUser();
		assertEquals("user not found", true, true);
	}

	@When("^I click on username \"([^\"]*)\"$")
	public void i_click_on_username(String arg1){
	    // Write code here that turns the phrase above into concrete actions
		UsersPage admin = PageFactory.initElements(driver, UsersPage.class);
		admin.clickUser();
	   
	}

	@When("^I click on configure link$")
	public void i_click_on_configure_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    throw new PendingException();
	}

	@When("^change the current fullname to new a new fullname \"([^\"]*)\"$")
	public void change_the_current_fullname_to_new_a_new_fullname(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click save button$")
	public void i_click_save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on People link$")
	public void i_click_on_People_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the new fullname \"([^\"]*)\" should be visible for the username \"([^\"]*)\"$")
	public void the_new_fullname_should_be_visible_for_the_username(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
