package jenkins;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemDetails {
	
	@FindBy(id="yui-gen38-button")
	private WebElement save;
	public void saved() {
		save.click();
	}

}
