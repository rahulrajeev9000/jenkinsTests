package jenkins;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage {
	
	@FindBy(xpath ="//*[@id=\"person-admin\"]/td[2]/a")
	private WebElement user;
	
	public void findUser() {
		user.isDisplayed();
	}
	
	public void clickUser() {
		user.click();
	}

}
