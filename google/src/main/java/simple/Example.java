package simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Example
{
	WebDriver driver;
	
	
	public void google()
	{
		System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println("the title is " + driver.getTitle());
		
	}

}
