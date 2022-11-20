package Utility;

import org.apache.commons.lang3.RandomStringUtils;

public class Randomstrings {
	public static final String generstedString= RandomStringUtils.randomAlphabetic(5);
	public static final String Randomeregionname=RandomStringUtils.randomAlphabetic(8);
	public static final String randomerigioncode =RandomStringUtils.randomNumeric(6);
	public static final String RandomeDealership=RandomStringUtils.randomAlphabetic(8);
    public static final String RandomeEmail=RandomStringUtils.randomAlphabetic(8);
    public static final String RandomeModel=RandomStringUtils.randomAlphabetic(4);
			
    
    
	public String randomerigioncode () 
	{
		String RandomeEmail=RandomStringUtils.randomNumeric(6);
		return(RandomeEmail);
	}
	public String randomeEmail () 
	{
		String RandomeEmail=RandomStringUtils.randomAlphabetic(8);
		return(RandomeEmail);
	}
	public String randomezipcode () 
	{
		String RandomeEmail=RandomStringUtils.randomNumeric(12);
		return(RandomeEmail);
	}
}
