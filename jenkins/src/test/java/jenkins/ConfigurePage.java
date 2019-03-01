package jenkins;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfigurePage {
	@FindBy (xpath="//*[@id=\"tasks\"]/div[4]/a[2]")
	private WebElement config;
	
	public void clickconfig() {
		
	}

}
