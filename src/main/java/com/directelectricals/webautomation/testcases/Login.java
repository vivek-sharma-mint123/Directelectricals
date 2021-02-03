package com.directelectricals.webautomation.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.directelectricals.webautomation.browsersetup.EnvironmentSetup;
import com.directelectricals.webautomation.config.Constants;
import com.directelectricals.webautomation.pageobjects.LoginPageObjects;
import com.directelectricals.webautomation.utilities.WaitUtilities;

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
	@Test(priority=1)
	public static void loginUser(){
		
		LoginPageObjects loginpage = PageFactory.initElements(EnvironmentSetup.webDriver, LoginPageObjects.class);
		EnvironmentSetup.webDriver.get(Constants.STAGING_URL);
		loginpage.txtEmail.clear();
		loginpage.txtEmail.sendKeys(Constants.USERNAME_STAGING);
		loginpage.txtPassword.clear();
		loginpage.txtPassword.sendKeys(Constants.PASSWORD_STAGING);
		loginpage.btnSignIn.click();
		WaitUtilities.waitForPageToLoad();		
		System.out.println("Login Successfully");
	}
	
}
