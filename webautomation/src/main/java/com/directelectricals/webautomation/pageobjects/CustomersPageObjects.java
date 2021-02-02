package com.directelectricals.webautomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CustomersPageObjects {
	
	//Using FindBy for locating elements
    @FindBy(how=How.XPATH, using="//span[contains(text(), 'Customers')]") 
    public WebElement menuCustomers;
    
    //Add Customer
    @FindBy(how=How.XPATH, using="//div[2]/div/div/div[2]/div[1]/div[2]/span/button") 
    public WebElement btnAddCustomer;
    @FindBy(how=How.XPATH, using="//input[@placeholder='Business Name']") 
    public WebElement txtBusinessName;
    @FindBy(how=How.XPATH, using="//input[@placeholder='Enter 11 digit ABN Number']") 
    public WebElement txtABN;
    @FindBy(how=How.XPATH, using="//textarea[@placeholder='Address']") 
    public WebElement txtAddress;
    @FindBy(how=How.XPATH, using="//input[@placeholder='Phone No']") 
    public WebElement txtPhone;
    @FindBy(how=How.XPATH, using="//div[1]/div[5]/div[2]/div/div/div/div/input[@placeholder='Email']") 
    public WebElement txtEmail;
    @FindBy(how=How.XPATH, using="//textarea[@placeholder='Site Address 1']") 
    public WebElement txtSiteAddress;
    @FindBy(how=How.XPATH, using="//input[@type='checkbox']") 
    public WebElement chkSetPrimary;
    @FindBy(how=How.XPATH, using="//input[@placeholder='Name']") 
    public WebElement txtName;
    @FindBy(how=How.XPATH, using="//div[2]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/input[@placeholder='Email']") 
    public WebElement txtContactEmail;
    @FindBy(how=How.XPATH, using="//div[2]/div[1]/div[2]/div[4]/div[2]/div/div/div/div/input[@placeholder='Phone No']") 
    public WebElement txtContactPhone;
    @FindBy(how=How.XPATH, using="//input[@placeholder='Job Role']") 
    public WebElement txtJobRole;
    @FindBy(how=How.XPATH, using="//p[@class='cancel-btn']") 
    public WebElement btnCancel;
    @FindBy(how=How.XPATH, using="//div[2]/div/div/div[2]/div[2]/div/span/button/span[1]") 
    public WebElement btnDone;
}
