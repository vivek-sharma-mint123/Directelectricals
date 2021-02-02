package com.ticketbook.webautomation.utilities;

import java.util.Random;

public class RandomNumbersUtilities {

	/*
	 * Create a Random number for send keys values
	 */
	
	public static int CreateRandomNum(){
		Random randomGenerator = new Random();
	    int randomInt = randomGenerator.nextInt(9000);  
	    return randomInt;
	    
	}

	
	
	
	
}
