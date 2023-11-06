package Projapoti_PageAction;

import org.testng.Assert;

import Projapoti_Pagelocator.Projapoti_SearchPagelocator;
import Projapoti_Utility.Projapoti_Base;
import Projapoti_Utility.Projapoti_Utiliti;

public class Projapoti_SearchPageAction extends Projapoti_Base {
	
	 Projapoti_SearchPagelocator  ProSearchPagelocator = new  Projapoti_SearchPagelocator();
	 
	 public void Verifyprousercansearchiteminsearchfield() {
		boolean verifysearch= ProSearchPagelocator.searchpage.isDisplayed();
		Assert.assertTrue(verifysearch);
		Projapoti_Utiliti.takeMyScreenshot(driver, "search page");
	 }
	
    public void Verifyusercandomouseover() throws Exception {
    	boolean verifyDB = ProSearchPagelocator.srchITM.isDisplayed();
    	Assert.assertTrue(verifyDB);
    	Thread.sleep(2000);
    	Projapoti_Utiliti.takeMyScreenshot(driver, "search item page");
    }
    
    public void  Verifyprousercandropdownandsearch() throws Exception {
    	 boolean successDD = ProSearchPagelocator.srchDD.isDisplayed();
    	 Assert.assertTrue(successDD);
    	 Thread.sleep(2000);
    	 Projapoti_Utiliti.takeMyScreenshot(driver, "Books page");
    }
    public void VerifyprousercanScrolldowninthepage() throws Exception {
    	boolean successSclldn = ProSearchPagelocator.srchSclldn.isDisplayed();
    	Assert.assertTrue(successSclldn);
    	Thread.sleep(2000);
    	Projapoti_Utiliti.takeMyScreenshot(driver, "Candles page");
    }
   
    
    
    
    
    
    
    
    
    
    
    
}
