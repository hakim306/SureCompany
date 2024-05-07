package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;
import Base.BasePage;

public class HomePage extends BasePage{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']//li[2]")
	WebElement PIM;
	
	public void clickPIM() {
		actions.WaitForElement(PIM, driver,5000);
		actions.Click(PIM, driver);
	}

}
