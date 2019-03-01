package jenkins;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id ="j_username")
	private WebElement username;
	
//	@FindBy(xpath ="/html/body/div/div/form/div[2]/input")
	@FindBy(name ="j_password")
	private WebElement password;
	
	public void logIn() {
		username.click();
		username.sendKeys("admin");
		password.click();
		password.sendKeys("admin");
		password.submit();
	}

}
