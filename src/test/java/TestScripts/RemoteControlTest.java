package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteControlTest {
	@Test
	  public void sampleTest()throws MalformedURLException  {
		  ChromeOptions options = new ChromeOptions();
		  options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		  String strHub = "";
		  RemoteWebDriver driver = new RemoteWebDriver(new URL(strHub), options);
		  driver.get("https://www.googgle.com/");
		  WebElement searchBox = driver.findElement(By.id("APjFqb"));
		  searchBox.sendKeys("SeleniumTutorial");
		  searchBox.submit();
		  System.out.println(driver.getTitle());
		  
	  }
	}
