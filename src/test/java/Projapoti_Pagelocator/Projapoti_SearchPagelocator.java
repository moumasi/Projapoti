package Projapoti_Pagelocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Projapoti_Utility.Projapoti_Base;

public class Projapoti_SearchPagelocator extends Projapoti_Base {
       
	    public Projapoti_SearchPagelocator() {
	    	PageFactory.initElements(driver, this);
	    	
	    }
	    @FindBy(xpath="//h1[@class='srp-controls__count-heading']")
	    public WebElement searchpage;
	    
	    @FindBy(xpath = "//img[@alt='eBay Consignment']")
	    public WebElement srchITM;
	    
	    
	    @FindBy(xpath = "//h2[@class='b-promobanner__info-title']")
	    public WebElement srchDD;
	    
	    
	    @FindBy(xpath = "//span[@class='b-pageheader__text']")
	    public WebElement srchSclldn;
	    
	    
	 
	    
	    
	     
   }














