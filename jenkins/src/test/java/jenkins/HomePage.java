package jenkins;
import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy (xpath="//*[@id=\"tasks\"]/div[2]/a[2]")
	private WebElement people;
	
	@FindBy (xpath= "//*[@id=\"tasks\"]/div[1]/a[2]")
	private WebElement newItem;
	
	@FindBy (id="main-panel")
	private WebElement items;
	
	@FindBy (xpath="//*[@id=\"tasks\"]/div[4]/a[2]/b")
	private WebElement manage;
	
	public void createItem() {
		newItem.click();
	}
	
	public void checkItemAdded() {
		items.isDisplayed();
		
	}
	
	public void manageUsers() {
		manage.click();
	}
	
	public void goToPeople() {
		people.click();
	}

}
