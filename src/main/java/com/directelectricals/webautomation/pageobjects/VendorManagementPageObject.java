package com.directelectricals.webautomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VendorManagementPageObject {
	
	//Using FindBy for locating elements
    @FindBy(how=How.XPATH, using="//span[contains(text(), 'Vendor Management')]") 
    public WebElement menuVendorManagement;
    
    //Add Vendor
    @FindBy(how=How.XPATH, using="//div/div[1]/div[2]/span/button/span[1]") 
    public WebElement btnAddVendor;
    @FindBy(how=How.XPATH, using="//main/div[2]/div/div/div[1]/div/div[2]/div/div/div/div") 
    public WebElement drpSelectVendorType;
    @FindBy(how=How.XPATH, using="//li[contains(text(), 'Supplier')]") 
    public WebElement optionSupplier;
    @FindBy(how=How.XPATH, using="//li[contains(text(), 'Sub-Contractor')]") 
    public WebElement optionSubContractor;
    @FindBy(how=How.XPATH, using="//div[1]/div[2]/div[2]/div[3]/div[2]/div/div/div/div/input[@placeholder='Email']") 
    public WebElement txtContactEmail;
    @FindBy(how=How.XPATH, using="//div[1]/div[2]/div[2]/div[4]/div[2]/div/div/div/div/input[@placeholder='Phone No']") 
    public WebElement txtContactPhone;
}
