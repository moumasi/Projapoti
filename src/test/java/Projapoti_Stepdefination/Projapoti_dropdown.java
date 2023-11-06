package Projapoti_Stepdefination;

import Projapoti_PageAction.Projapoti_HomePageAction;
import Projapoti_PageAction.Projapoti_SearchPageAction;
import Projapoti_Utility.Projapoti_Base;
import cucumber.api.java.en.Then;

public class Projapoti_dropdown extends Projapoti_Base{
	
	Projapoti_HomePageAction ProHomePageAction = new Projapoti_HomePageAction();
	Projapoti_SearchPageAction ProSearchPageAction = new Projapoti_SearchPageAction();
	
	@Then("^Select Books from dropdown$")
	public void select_Books_from_dropdown() throws Throwable {
		ProHomePageAction.SelectBooksfromdropdown();
	}

	@Then("^Click Search Button$")
	public void click_Search_Button() throws Throwable {
		ProHomePageAction.ClickSearchButton();
	}

	@Then("^Verify prouser can dropdown and search$")
	public void verify_prouser_can_dropdown_and_search() throws Throwable {
		 ProSearchPageAction.Verifyprousercandropdownandsearch();
	  
	}



}
