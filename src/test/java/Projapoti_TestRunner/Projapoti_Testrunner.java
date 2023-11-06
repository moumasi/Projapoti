package Projapoti_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Projapoti_Utility.Projapoti_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Projapoti_feature"},
plugin = {"json:target/cucumber.json"},
glue = "Projapoti_Stepdefination",tags = {"@Jojoba"})



public class Projapoti_Testrunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void proStarturl() {
		Projapoti_Base pro=new Projapoti_Base();
		pro.probrowser();
	}
	@AfterTest
	public void proCloseurl() {
		Projapoti_Base pro=new Projapoti_Base();
		//pro.driver.quit();
	}

}
