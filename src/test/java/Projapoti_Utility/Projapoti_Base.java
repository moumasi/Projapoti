package Projapoti_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Projapoti_Base {
	
	public static WebDriver driver;
	public static Properties propro;
	
	public  Projapoti_Base() {
		try {
			FileInputStream profl= new FileInputStream(System.getProperty("user.dir")+("//src/test//java/Projapoti_Config//Projapoti_Config.properties"));
			     propro = new Properties();
			     propro.load(profl);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Please look the code");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void probrowser() {
		String proAllbrowser=propro.getProperty("ProBrowser1");
		if(proAllbrowser.equalsIgnoreCase("Chrome")) {
			 System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+ ("//Projapoti//Projapoti_ChromeDriver//chrome.exe"));
			  ChromeOptions naz= new ChromeOptions();
			  naz.addArguments("--remote-allow-origins=*");
			  
			  driver= new ChromeDriver();
			  
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Projapoti_Utiliti .pageLoadTimeout));   
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Projapoti_Utiliti .implicitlyWait)); 
			  driver.manage().window().maximize(); 
		}
		else if(proAllbrowser.equalsIgnoreCase("Edge")) {
			System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+ ("//Projapoti//Projapoti_EdgeDriver//msedgedriver.exe"));
			  EdgeOptions naz= new EdgeOptions();
			  naz.addArguments("--remote-allow-origins=*");
			  
			  driver= new EdgeDriver();
			  
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Projapoti_Utiliti .pageLoadTimeout));   
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Projapoti_Utiliti .implicitlyWait)); 
			  driver.manage().window().maximize(); 
		}
	}
	public static void prolaunchurl(String url) {
		driver.get(propro.getProperty("Prourl"));
	}

}
