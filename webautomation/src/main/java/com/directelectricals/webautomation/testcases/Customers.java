package com.directelectricals.webautomation.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.directelectricals.webautomation.browsersetup.EnvironmentSetup;
import com.directelectricals.webautomation.pageobjects.CustomersPageObjects;
import com.directelectricals.webautomation.utilities.WaitUtilities;

public class Customers {
	
	@Test(priority=1)
	public static void verifyUserManagementUI(){
		
		CustomersPageObjects customerpage = PageFactory.initElements(EnvironmentSetup.webDriver, CustomersPageObjects.class);
		Assert.assertTrue(customerpage.menuCustomers.isDisplayed());
		customerpage.menuCustomers.click();;
		WaitUtilities.waitForPageToLoad();
	}

	@Test(priority=2)
	public static void addCustomer(){
		
		CustomersPageObjects customerpage = PageFactory.initElements(EnvironmentSetup.webDriver, CustomersPageObjects.class);
		Assert.assertTrue(customerpage.btnAddCustomer.isDisplayed());
		customerpage.btnAddCustomer.click();
		WaitUtilities.waitForPageToLoad();
		customerpage.txtBusinessName.sendKeys("Enlighten");
		customerpage.txtABN.sendKeys("QW123456789");
		customerpage.txtAddress.sendKeys("Race Course Road Indore");
		customerpage.txtPhone.sendKeys("9988445577");
		customerpage.txtEmail.sendKeys("enlighten@getnada.com");
		customerpage.txtSiteAddress.sendKeys("Race Course Road Indore");
		customerpage.chkSetPrimary.click();
		customerpage.txtName.sendKeys("Vivek Shama");
		customerpage.txtContactEmail.sendKeys("vivek.sharma@getnada.com");
		customerpage.txtContactPhone.sendKeys("9988445578");
		customerpage.txtJobRole.sendKeys("Manager");
		Assert.assertTrue(customerpage.btnDone.isDisplayed());
		Assert.assertTrue(customerpage.btnCancel.isDisplayed());
		customerpage.btnCancel.click();
		JavascriptExecutor jse = (JavascriptExecutor)EnvironmentSetup.webDriver;
		jse.executeScript("window.scrollBy(0, -250)");
	}
}
