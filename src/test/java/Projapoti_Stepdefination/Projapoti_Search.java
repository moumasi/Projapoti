package Projapoti_Stepdefination;


import Projapoti_PageAction.Projapoti_HomePageAction;
import Projapoti_PageAction.Projapoti_SearchPageAction;
import Projapoti_Utility.Projapoti_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Projapoti_Search extends Projapoti_Base{
	
	Projapoti_HomePageAction ProHomePageAction = new Projapoti_HomePageAction();
	Projapoti_SearchPageAction  ProSearchPageAction =new  Projapoti_SearchPageAction();
	
	@Given("^Launch <\"([^\"]*)\"> pro$")
	public void launch_pro(String url ) throws Throwable {
		prolaunchurl(url);
	}

	@Then("^Enter Toys and click search icon$")
	public void enter_Toys_and_click_search_icon() throws Throwable {
		 ProHomePageAction.EnterToysandclicksearchicon(propro.getProperty("ProSearch"));
	   
	}

	@Then("^Verify prouser can search item in search field$")
	public void verify_prouser_can_search_item_in_search_field() throws Throwable {
		ProSearchPageAction.Verifyprousercansearchiteminsearchfield();
	   
	}
	
	
	}



	
	


