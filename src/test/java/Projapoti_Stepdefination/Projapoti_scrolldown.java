package Projapoti_Stepdefination;

import Projapoti_PageAction.Projapoti_HomePageAction;
import Projapoti_PageAction.Projapoti_SearchPageAction;
import Projapoti_Utility.Projapoti_Base;
import cucumber.api.java.en.Then;

public class Projapoti_scrolldown extends Projapoti_Base{
	
	Projapoti_HomePageAction ProHomePageAction = new Projapoti_HomePageAction();
	 Projapoti_SearchPageAction  ProSearchPageAction = new  Projapoti_SearchPageAction();
	 
	@Then("^Click on Candles$")
	public void click_on_Candles() throws Throwable {
		
		 ProHomePageAction.ClickonCandles();
	   
	}

	@Then("^Verify prouser can Scrolldown in the page$")
	public void verify_prouser_can_Scrolldown_in_the_page() throws Throwable {
		
		 ProSearchPageAction.VerifyprousercanScrolldowninthepage();
		 
	}



}
