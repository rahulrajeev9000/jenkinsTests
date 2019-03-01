package jenkins;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage {
	@FindBy (xpath="//*[@id=\"tasks\"]/div[3]/a[2]")
	private WebElement create;
	
	public void add() {
		create.click();
	}

}
