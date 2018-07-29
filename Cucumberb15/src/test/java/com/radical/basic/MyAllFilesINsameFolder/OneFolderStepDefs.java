package com.radical.basic.MyAllFilesINsameFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OneFolderStepDefs {
	WebDriver driver=new ChromeDriver();
	
	@Given("^the user is on facebook login Page$")
	
public void the_user_is_on_facebook_login_Page()
{
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Selenium\\SeleniumWedriver\\chromedriver.exe");
		
	
	driver.get("https://www.facebook.com/");
	
	
}
	@When("^he enters \"([^\"]*)\" as user name$")
	public void He_enters_user_name(String userName) {
		driver.findElement(By.id("email")).sendKeys(userName);
	}
	
	
}
