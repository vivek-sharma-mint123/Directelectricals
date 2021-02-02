package com.ticketbook.webautomation.utilities;


import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.ticketbook.webautomation.browsersetup.EnvironmentSetup;

public class WaitUtilities {



	public static void waitForPageToLoad() {
		try {
			int waitTime = 0;
			boolean isPageLoadComplete = false;
			do {
				isPageLoadComplete = ((String) ((JavascriptExecutor) EnvironmentSetup.webDriver)
						.executeScript("return document.readyState")).equals("complete");
				System.out.print(".");
				Thread.sleep(5000);
				EnvironmentSetup.webDriver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.MINUTES);
				if (!isPageLoadComplete) {
					EnvironmentSetup.webDriver.manage().window().maximize();
				}
				waitTime++;
				if (waitTime > 5) {
					break;
				}
			} while (!isPageLoadComplete);
			if (!isPageLoadComplete) {
				Assert.fail("unable to load webpage with in default timeout 250 seconds");
			}
		} catch (Exception e) {
			Assert.fail("unable to load webpage" + "\n" + e.getMessage());
		}

	}
	
	public static void waitAndClick(WebElement btn){
		
		// 3 attempt to click on the button 
		for(int idx=0;idx<3;idx++){
							
			try{
				Thread.sleep(3000);
				btn.click();
				break;
			}catch(Exception e){
				
			}				
		}
		
		/*
		// 3 attempt to click on the button 
		for(int idx=0;idx<3;idx++){
							
			try{
				Thread.sleep(3000);
				userpage.btnAddUser.click();
				break;
			}catch(Exception e){
				
			}				
		}
		*/
		
	}
	
		
}
	
	
	
	

