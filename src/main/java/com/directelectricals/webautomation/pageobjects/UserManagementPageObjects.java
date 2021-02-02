package com.directelectricals.webautomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserManagementPageObjects {

	//Using FindBy for locating elements
    @FindBy(how=How.XPATH, using="//span[contains(text(), 'User Management')]") 
    public WebElement menuUserManagement;
    
    //Add User
    @FindBy(how=How.XPATH, using="//div[2]/div[2]/span[2]/button/span[1]") 
    public WebElement btnAddUser;
    @FindBy(how=How.XPATH, using="//div[2]/div/div/div[4]/div[1]/div[2]/div/div/div/div") 
    public WebElement drpSelectUserType;
    @FindBy(how=How.XPATH, using="//li[contains(text(), 'Super Admin')]") 
    public WebElement optionSuperAdmin;
    @FindBy(how=How.XPATH, using="//li[2][contains(text(), 'Admin')]") 
    public WebElement optionAdmin;
    @FindBy(how=How.XPATH, using="//div[4]/div[2]/div[2]/div/div/div") 
    public WebElement drpEmploymentType;
    @FindBy(how=How.XPATH, using="//li[contains(text(), 'Contract')]") 
    public WebElement optionContract;
    @FindBy(how=How.XPATH, using="//li[2][contains(text(), 'Full Time')]") 
    public WebElement optionFullTime;
    @FindBy(how=How.XPATH, using="//input[@placeholder='Hourly Rate']") 
    public WebElement txtHourlyRate;
    @FindBy(how=How.XPATH, using="//input[@placeholder='Full Name']") 
    public WebElement txtFullName;
    @FindBy(how=How.XPATH, using="//input[@placeholder='Email']") 
    public WebElement txtEmail;
    @FindBy(how=How.XPATH, using="//input[@placeholder='Phone Number']") 
    public WebElement txtPhoneNumber;
    @FindBy(how=How.XPATH, using="//div[2]/div/div/div[4]/div[8]/div[2]/div/div/div") 
    public WebElement drpPasswordType;
    @FindBy(how=How.XPATH, using="//li[contains(text(), 'Custom')]") 
    public WebElement optionCustom;
    @FindBy(how=How.XPATH, using="//input[@placeholder='Password']") 
    public WebElement txtPassword;
    @FindBy(how=How.XPATH, using="//p[@class='cancel-btn']") 
    public WebElement btnCancel;
    @FindBy(how=How.XPATH, using="//div[2]/div/div/div[4]/div[10]/div/span/button") 
    public WebElement btnDone;
}
