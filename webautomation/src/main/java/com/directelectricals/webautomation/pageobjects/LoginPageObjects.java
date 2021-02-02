package com.directelectricals.webautomation.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {

    //Using FindBy for locating elements
    @FindBy(how=How.XPATH, using="//input[@type='email']") 
    public WebElement txtEmail;
    @FindBy(how=How.XPATH, using="//input[@type='password']") 
    public WebElement txtPassword;
    @FindBy(how=How.XPATH, using="//input[@type='password']") 
    public WebElement chkKeepMeLogin;    
    @FindBy(how=How.XPATH, using="//span[@class='MuiButton-label']") 
    public WebElement btnSignIn;	  
}
