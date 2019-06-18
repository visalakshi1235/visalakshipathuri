package com.number.word.service;

import java.text.DecimalFormat;

import com.number.word.constants.NumberToWordConstant;
import com.number.word.util.NumberToWordUtil;

public class NumberToWordConverter {
	NumberToWordUtil util=new NumberToWordUtil();
	NumberToWordConstant constant =new NumberToWordConstant();
	public enum TenNames {
		Space(""),
		TEN(" ten"),
		Twenty(" twenty"),
		Thirty(" thirty"),
		Forty(" forty"),
		Fifty(" fifty"),
		Sixty(" sixty"),
		Seventy(" seventy"),
		Eighty(" eighty"),
		Ninety(" ninety");
	private final String value;
	TenNames(final String value)
	{
		this.value=value;
	}
	public String getValue()
	{
		return value;
	}
 }
	
	public enum NumNames {
		Space(" "),
		One(" one"),
		Two(" two"),
		Three(" three"),
		Four(" four"),
		Five(" five"),
		Six(" six"),
		Seven(" seven"),
		Eight(" eight"),
		Nine(" nine"),
		Ten(" ten"),
		Eleven(" eleven"),
		Twelve(" twelve"),
		Thirteen(" thirteen"),
		Fourteen(" fourteen"),
		Fifteen(" fifteen"),
		Sixteen(" sixteen"),
		Seventeen(" seventeen"),
		Eighteen(" eighteen"),
		Nineteen("nineteen");
	private final String value;
	private NumNames(final String value)
	{
		this.value=value;
	}
	public String getValue()
	{
		return value;
	}
		
}
	private String converterLessThanThousand(int number) {
		
		String soFar;
		TenNames[] tenNamesList=TenNames.values();
		NumNames[] numNamesList=NumNames.values();
		
		if (number % 100 < 20 ) {
			soFar = numNamesList[number % 100].value;
			number /= 100;
		}
		
		else {
			
			soFar =numNamesList[number % 10].value;
			number /= 10;
			
			
			soFar = tenNamesList[number % 10].value+soFar;
			number /= 10;
			
		}
		
		if (number ==0) return soFar;
		
		return tenNamesList[number].value + constant.hundred + soFar;
		
	}
	
	public String convert(long number) {
		
		
		if (number ==0) { return constant.zero;}
		
		String snumber = Long.toString(number);
		
		
		//pad with "0"
		DecimalFormat df = new DecimalFormat(constant.mask);
		snumber = df.format(number);
		
		int billions = Integer.parseInt(snumber.substring(0, 3));
		
		int millions = Integer.parseInt(snumber.substring(3, 6));
		
		int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
		
		int thousands = Integer.parseInt(snumber.substring(9, 12));
		
		String result = convertToBillion(billions);
		
		String tradMillions=convertToMillion(millions);
		
       result = result + tradMillions;
       
       String tradHundredThousnds=convertToHundredThousnds(hundredThousands);
       
       
        result = result + tradHundredThousnds;
        
        String tradThousand = converterLessThanThousand(thousands);
        result = result + tradThousand;
        
        //removing spaces
        return util.removeWhiteSpaces(result);
		
	}

	private String convertToHundredThousnds(int hundredThousands) {
		String tradHundredThousnds;
		switch(hundredThousands) {
		  
		case 0:
			tradHundredThousnds = "";
			break;
			
		case 1:
			tradHundredThousnds = constant.oneThousand;
			break;
			  
	    default :
	    	
	    	tradHundredThousnds = converterLessThanThousand(hundredThousands) + constant.thousand;
			break;
		}
		return tradHundredThousnds;
	}

	private String convertToMillion(int millions) {
		String tradMillions;
		switch(millions) {
		  
		case 0:
			tradMillions = "";
			break;
			
		case 1:
			tradMillions = converterLessThanThousand(millions) + constant.million;
			break;
			  
	    default :
	    	
	    	tradMillions = converterLessThanThousand(millions) + constant.million;
			break;
		}
		return tradMillions;
	}

	private String convertToBillion(int billions) {
		String tradBillions="";
		switch(billions) {
		  
		case 0:
			tradBillions = "";
			break;
			
		case 1:
			tradBillions = converterLessThanThousand(billions) + constant.billion;
			break;
			  
	    default :
	    	
	    	tradBillions = converterLessThanThousand(billions) + constant.billion;
			break;
		}
		return tradBillions;
	}
	

}
