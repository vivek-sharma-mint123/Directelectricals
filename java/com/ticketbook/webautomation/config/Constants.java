package com.ticketbook.webautomation.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Constants {
	
	/*
	 * Get the config properties file path
	 * Read property file and init constant
	 */
	
	public static String STAGING_URL = null;
	public static String USERNAME_STAGING = null;
	public static String PASSWORD_STAGING = null;
	public static String CHROME_BROWSER = null;
	public static String MOZILLA_BROWSER = null;
	public static String CHROME_DRIVER = null;
	public static String MOZILLA_DRIVER = null;
	public static String CHROME_DRIVER_PATH = null;
	public static String MOZILLA_DRIVER_PATH = null;
	
	
	static {
		
		String configFileName = "config.properties";
		
		try {
			
			String userDir = System.getProperty("user.dir");
			
			String configFilePath =  userDir + "/src/main/java/com/ticketbook/webautomation/config/" + configFileName; 	
			File f = new File(configFilePath);
//			System.out.println(f.getAbsolutePath());
//			System.out.println(f.getCanonicalPath());
			
			InputStream in = new FileInputStream(configFilePath);
//			System.out.println(configFilePath);
			Properties prop = new Properties();
			
			prop.load(in);
			
			STAGING_URL = prop.getProperty("STAGING_URL");
			USERNAME_STAGING = prop.getProperty("USERNAME_STAGING");
			PASSWORD_STAGING = prop.getProperty("PASSWORD_STAGING");
			CHROME_BROWSER = prop.getProperty("CHROME_BROWSER");
			MOZILLA_BROWSER = prop.getProperty("MOZILLA_BROWSER");
			CHROME_DRIVER = prop.getProperty("CHROME_DRIVER");
			MOZILLA_DRIVER = prop.getProperty("MOZILLA_DRIVER");
			CHROME_DRIVER_PATH = prop.getProperty("CHROME_DRIVER_PATH");
			MOZILLA_DRIVER_PATH = prop.getProperty("MOZILLA_DRIVER_PATH");
			
			
		}catch(Exception e) {
			System.err.println("Error : " + e);
			e.printStackTrace();
		}

		
	}
	
	

}
