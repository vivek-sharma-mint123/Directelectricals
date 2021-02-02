package com.directelectricals.webautomation.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.directelectricals.webautomation.browsersetup.EnvironmentSetup;
import com.directelectricals.webautomation.pageobjects.UserManagementPageObjects;
import com.directelectricals.webautomation.utilities.WaitUtilities;

public class UserManagement {
	
	@Test(priority=1)
	public static void verifyUserManagementUI(){
		
		UserManagementPageObjects userpage = PageFactory.initElements(EnvironmentSetup.webDriver, UserManagementPageObjects.class);
		Assert.assertTrue(userpage.menuUserManagement.isDisplayed());
		userpage.menuUserManagement.click();;
		WaitUtilities.waitForPageToLoad();
	}

	@Test(priority=2)
	public static void addUser(){
		
		UserManagementPageObjects userpage = PageFactory.initElements(EnvironmentSetup.webDriver, UserManagementPageObjects.class);
		Assert.assertTrue(userpage.btnAddUser.isDisplayed());
		userpage.btnAddUser.click();
		WaitUtilities.waitForPageToLoad();
		userpage.drpSelectUserType.click();
		userpage.optionSuperAdmin.click();
		userpage.drpEmploymentType.click();
		userpage.optionContract.click();
		userpage.txtHourlyRate.sendKeys("100");
		userpage.txtFullName.sendKeys("Vivek Sharma");
		userpage.txtEmail.sendKeys("vivek.sharma@getnada.com");
		userpage.txtPhoneNumber.sendKeys("9876565656");
		userpage.drpPasswordType.click();
		userpage.optionCustom.click();
		userpage.txtPassword.sendKeys("Vivek@2021");
		Assert.assertTrue(userpage.btnDone.isDisplayed());
		Assert.assertTrue(userpage.btnCancel.isDisplayed());
		userpage.btnCancel.click();
		JavascriptExecutor jse = (JavascriptExecutor)EnvironmentSetup.webDriver;
		jse.executeScript("window.scrollBy(0, -250)");
		
	}
}
