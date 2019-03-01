package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemCreated {
	WebDriver driver;
	
	@FindBy (xpath="<a href=\"/\" class=\"task-link\">Back to Dashboard</a>")
	private WebElement back;
	
	public void dash() {
		
		back.click();
	}

}
