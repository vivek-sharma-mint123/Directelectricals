package com.ticketbook.webautomation.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ticketbook.webautomation.browsersetup.EnvironmentSetup;

public class ElementUtilities {
	
	public static boolean isElementPresent( String locatorString, int waitTime) {
		boolean bFlag = false;
		try {
			WebDriverWait wait = new WebDriverWait(EnvironmentSetup.webDriver, waitTime);
			wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorString)));
			bFlag = true;
		} catch (Exception e) {
			return bFlag;
			// TODO: handle exception
		}
		return bFlag;
	}

	private static By getLocator(String locatorString) {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean isElementVisible(String locatorString, int waitTime) {
		boolean bFlag = false;
		try {
			WebDriverWait wait = new WebDriverWait(EnvironmentSetup.webDriver, waitTime);
			wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator(locatorString)));
		} catch (Exception e) {
			return bFlag;
			// TODO: handle exception
		}
		return bFlag;
	}

	public static void waitForElementClickableLocator(String locatorString, long sec) {
		WebDriverWait wait = new WebDriverWait(EnvironmentSetup.webDriver, sec);
		wait.until(ExpectedConditions.elementToBeClickable(getLocator(locatorString)));
	}

}
