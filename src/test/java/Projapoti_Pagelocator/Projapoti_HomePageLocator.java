package Projapoti_Pagelocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Projapoti_Utility.Projapoti_Base;

public class Projapoti_HomePageLocator extends Projapoti_Base {
	
	public  Projapoti_HomePageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement search;
	
	
	@FindBy(id="gh-btn")
	public WebElement probutton;
	
	@FindBy(linkText = "Fashion")
	public WebElement proMO;
	
	@FindBy(linkText = "Designer Handbags")
	public WebElement peoELE;
	
	///////////////////
	@FindBy(name = "_sacat")
	public WebElement proDD;
	
	@FindBy(id = "gh-btn")
	public WebElement proButton;
	
	@FindBy(css = "#mainContent > div:nth-child(7) > ul > li:nth-child(7) > a > h3")
	public WebElement proSD;
	
	
	
	
	
	
	
	
	

}
