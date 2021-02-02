package com.ticketbook.webautomation.browsersetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.ticketbook.webautomation.config.Constants;

public class EnvironmentSetup {

	public static WebDriver webDriver;

	/*
	 * Launch a browser using config properties.
	 * Enter tru video url.
	 * Maximize the browser window
	 */
	public static WebDriver setBrowser(String browserName, String url) {

	
		if (browserName.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();

			String Test = System.setProperty(Constants.CHROME_DRIVER, Constants.CHROME_DRIVER_PATH);
			webDriver = new ChromeDriver(options);
		} else if (browserName.equals("mozilla")) {
			System.setProperty(Constants.MOZILLA_DRIVER, Constants.MOZILLA_DRIVER_PATH);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			webDriver = new FirefoxDriver();
		}

		webDriver.get(url);
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		return webDriver;
	}
}