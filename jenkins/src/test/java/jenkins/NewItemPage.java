package jenkins;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewItemPage {
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(xpath = "//*[@id=\"j-add-item-type-standalone-projects\"]/ul/li[1]")
	private WebElement freestyle;
	
	@FindBy(id="ok-button")
	private WebElement ok;
	
	
	public void enter() {
		name.sendKeys("automatedItem7");
		freestyle.click();
		ok.click();
	}

}
