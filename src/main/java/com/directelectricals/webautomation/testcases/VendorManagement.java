package com.directelectricals.webautomation.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.directelectricals.webautomation.browsersetup.EnvironmentSetup;
import com.directelectricals.webautomation.pageobjects.CustomersPageObjects;
import com.directelectricals.webautomation.pageobjects.VendorManagementPageObject;
import com.directelectricals.webautomation.utilities.WaitUtilities;

public class VendorManagement {
	
	@Test(priority=1)
	public static void verifyUserManagementUI(){
		
		VendorManagementPageObject vendorpage = PageFactory.initElements(EnvironmentSetup.webDriver, VendorManagementPageObject.class);
		Assert.assertTrue(vendorpage.menuVendorManagement.isDisplayed());
		vendorpage.menuVendorManagement.click();;
		WaitUtilities.waitForPageToLoad();
	}

	@Test(priority=2)
	public static void addVendor(){
		
		VendorManagementPageObject vendorpage = PageFactory.initElements(EnvironmentSetup.webDriver, VendorManagementPageObject.class);
		CustomersPageObjects customerpage = PageFactory.initElements(EnvironmentSetup.webDriver, CustomersPageObjects.class);
		Assert.assertTrue(vendorpage.btnAddVendor.isDisplayed());
		vendorpage.btnAddVendor.click();
		WaitUtilities.waitForPageToLoad();
		vendorpage.drpSelectVendorType.click();
		vendorpage.optionSupplier.click();
		customerpage.txtBusinessName.sendKeys("Bulb Supplier");
		customerpage.txtABN.sendKeys("QY123456789");
		customerpage.txtAddress.sendKeys("Race Course Road Indore");
		customerpage.txtPhone.sendKeys("9988445577");
		customerpage.txtEmail.sendKeys("supplier@getnada.com");
		customerpage.chkSetPrimary.click();
		customerpage.txtName.sendKeys("Vivek Shama");
		vendorpage.txtContactEmail.sendKeys("vivek.sharma@getnada.com");
		vendorpage.txtContactPhone.sendKeys("9988445578");
		customerpage.txtJobRole.sendKeys("Manager");
		Assert.assertTrue(customerpage.btnDone.isDisplayed());
		Assert.assertTrue(customerpage.btnCancel.isDisplayed());
		customerpage.btnCancel.click();
		JavascriptExecutor jse = (JavascriptExecutor)EnvironmentSetup.webDriver;
		jse.executeScript("window.scrollBy(0, -250)");
	}

}
