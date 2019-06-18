package com.number.word.validations;

import com.number.word.constants.NumberToWordConstant;
import com.number.word.exception.NumberToWordException;

public class NumberToWordValidator {
	NumberToWordConstant constant =new NumberToWordConstant();
	public boolean negativeNumberValidator(long number) throws NumberToWordException{
		if(number<0)
		{
			throw new NumberToWordException(constant.negMsg);
		}
		else
		{
			return true;
		}
	}
	
	public boolean alphaNumericValidator(long number) throws NumberToWordException
	{
		String nuberStr=number+"";
		boolean result= nuberStr.matches("[A-Za-z0-9]+");
		if(!result)
		{
			throw new NumberToWordException(constant.alphaNumericMsg);
		}
		else
		{
			return true;
		}
	}

}
