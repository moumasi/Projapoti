package Projapoti_PageAction;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Projapoti_Pagelocator.Projapoti_HomePageLocator;
import Projapoti_Utility.Projapoti_Base;
import Projapoti_Utility.Projapoti_TestData;

public class Projapoti_HomePageAction extends Projapoti_Base {
	 
	Projapoti_HomePageLocator ProHomePageLocator = new Projapoti_HomePageLocator();
	
	public void  EnterToysandclicksearchicon(String u) throws Exception {
		 Thread.sleep(5000);
		ProHomePageLocator.search.sendKeys(Projapoti_TestData.ProSearch);
		ProHomePageLocator.probutton.click();
	}
	public void  MouseovertoFashion() throws Exception {
		Actions act = new Actions(driver);
		act.moveToElement(ProHomePageLocator.proMO).build().perform();
		Thread.sleep(3000);
	}
	public void  clickonDesignerHandbags() throws Exception {
		ProHomePageLocator.peoELE.click();
		Thread.sleep(3000);
	}
	public void SelectBooksfromdropdown() throws Exception {
		Select DrDwn = new Select(ProHomePageLocator.proDD);
		 DrDwn.selectByVisibleText(Projapoti_TestData.ProSearch2);
		 Thread.sleep(2000);
	}
	public void ClickSearchButton() throws Exception {
		ProHomePageLocator.proButton.click();
		 Thread.sleep(2000);
	}
	public void ClickonCandles() {
		 ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		 ProHomePageLocator.proSD.click();
	}

	
	
}