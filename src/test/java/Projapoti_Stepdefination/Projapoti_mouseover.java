package Projapoti_Stepdefination;

import Projapoti_PageAction.Projapoti_HomePageAction;
import Projapoti_PageAction.Projapoti_SearchPageAction;
import Projapoti_Utility.Projapoti_Base;
import cucumber.api.java.en.Then;

public class Projapoti_mouseover extends Projapoti_Base{
	
	Projapoti_HomePageAction ProHomePageAction = new Projapoti_HomePageAction();
	Projapoti_SearchPageAction ProSearchPageAction = new Projapoti_SearchPageAction();
	
	@Then("^Mouse over to Fashion$")
	public void mouse_over_to_Fashion() throws Throwable {
		ProHomePageAction.MouseovertoFashion(); 
	}

	@Then("^click on Designer Handbags$")
	public void click_on_Designer_Handbags() throws Throwable {
		ProHomePageAction.clickonDesignerHandbags();
	   
	}
	
   @Then("^Verify user can do mouse over$")
	public void verify_user_can_do_mouse_over() throws Throwable {
	   ProSearchPageAction.Verifyusercandomouseover(); 
	}


}
 