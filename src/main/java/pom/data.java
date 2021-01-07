package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.autocon;
import generic.excel;
import generic.methods;


public class data extends methods implements autocon  {

	@FindBy(xpath="//button[@data-trigger='click']")
	public WebElement click;
	
	@FindBy(xpath="(//span[.='Start Now'])[1]")
	public WebElement start;
	
	@FindBy(xpath="(//input[@autocomplete='email'])[1]")
	public WebElement email;
	
	@FindBy(xpath="(//input[@autocomplete='email'])[2]")
	public WebElement email2;
	
	@FindBy(name="password")
	public WebElement pass;
	
	@FindBy(name="passwordConfirm")
	public WebElement repass;

	@FindBy(xpath="//button[.='Sign Up']")
	public WebElement signup;
	
	public data(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void submit() throws IOException, InterruptedException {
		
		click.click();
		
		start.click();
		email.sendKeys(excel.getcell(excel_path, sheet_name, 1, 0));
		Thread.sleep(3000);
		email2.sendKeys(excel.getcell(excel_path, sheet_name, 1, 1));
		pass.sendKeys(excel.getcell(excel_path, sheet_name, 1, 2));
		Thread.sleep(3000);
		repass.sendKeys(excel.getcell(excel_path, sheet_name, 1, 3));
		signup.click();

	}

}
 
	
