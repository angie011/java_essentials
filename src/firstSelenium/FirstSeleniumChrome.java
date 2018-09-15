package firstSelenium;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import libs.Input;

public class FirstSeleniumChrome {

    public static void main(String[] args) {
    	//System.setProperty("webdriver.gecko.driver", "C:\\test_automation\\drivers\\geckodriver.exe");
    	System.setProperty("webdriver.chrome.driver", "/Users/angelaguarin/test_automation/drivers/chromedriver");
    	
        WebDriver driver = new ChromeDriver();
        
        
        String expectedTitle = "Welcome: Mercury Tours";
        driver.get("http://newtours.demoaut.com");
        String actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
        //driver.quit();
    }

	private static FirefoxProfile getProfile(String profileName) {
		return new ProfilesIni().getProfile(profileName);
	}
}

