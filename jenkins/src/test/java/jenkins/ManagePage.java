package jenkins;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagePage {
	@FindBy(xpath= "//*[@id=\"main-panel\"]/div[16]/a")
	private WebElement manageUser;
	
	public void click() {
		manageUser.click();
	}

}
