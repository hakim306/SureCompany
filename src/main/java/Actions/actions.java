package Actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasePage;

public class actions extends BasePage{
	
	public static void Click(WebElement element, WebDriver driver) {
		element.click();
	}
	
	public static void DblClick(WebElement element, WebDriver driver) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).doubleClick().build().perform();
	}
	
	public static void mouseOver(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	public static void setText(WebElement element, String text,WebDriver driver) {
		element.sendKeys(text);
	}
	
	public static String getText(WebElement element){
		String text=element.getText();
		return text;
	}
	
	public static boolean isElementPresent(WebElement element){
		if(element.isDisplayed()) {
			System.out.println("the element present");
			return true;
		}else {
			System.out.println("can't find an element");
			return false;
		}
	}
	
	public static void WaitForElement(WebElement element, WebDriver driver,int time) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
	}
	
}
