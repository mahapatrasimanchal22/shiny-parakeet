package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class methods {

	
	public void selectbyvisibletext(WebElement element, String text) {

		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectbyindex(WebElement element, int num) {
		
		Select sel=new Select(element);
		sel.selectByIndex(num);
	}
	
	public void selectbyvalue(WebElement element, String value){
		
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void rightclick(WebDriver driver, WebElement element) {
		
		Actions act=new Actions(driver);
		act.contextClick().perform();
		act.sendKeys("w").perform();
	}
	
	public void clickholdandrelase(WebDriver driver, WebElement element) {
	
		Actions act=new Actions(driver);
		act.clickAndHold(element).perform();
		act.release(element).perform();
	}
	

}
