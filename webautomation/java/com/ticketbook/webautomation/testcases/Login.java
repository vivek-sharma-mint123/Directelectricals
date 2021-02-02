package com.ticketbook.webautomation.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ticketbook.webautomation.browsersetup.EnvironmentSetup;
import com.ticketbook.webautomation.config.Constants;
import com.ticketbook.webautomation.pageobjects.LoginPageObjects;
import com.ticketbook.webautomation.utilities.WaitUtilities;

public class Login {




	/*
	 * Open a browser using config properties
	 */
	
	@BeforeClass
	public void openBrowser() throws Exception {
			EnvironmentSetup.webDriver = EnvironmentSetup.setBrowser(Constants.CHROME_BROWSER, Constants.STAGING_URL);
	}
	
	/*
	 * Go to the URL
	 * Enter a value of Email 
	 * Enter a value of Password 
	 * Click on login button
	 */
	@Test
	public static void loginUser(){
		
		LoginPageObjects loginpage = PageFactory.initElements(EnvironmentSetup.webDriver, LoginPageObjects.class);
		EnvironmentSetup.webDriver.get(Constants.STAGING_URL);
//		loginpage.txtEmail.clear();
//		loginpage.txtEmail.sendKeys(Constants.USERNAME_STAGING);
//		loginpage.txtPassword.clear();
//		loginpage.txtPassword.sendKeys(Constants.PASSWORD_STAGING);
//		loginpage.btnSignIn.click();
		WaitUtilities.waitForPageToLoad();		
	}
	
}
