package com.number.word;

import java.util.Scanner;

import com.number.word.exception.NumberToWordException;
import com.number.word.service.NumberToWordConverter;
import com.number.word.validations.NumberToWordValidator;

public class NumberToWordApplication {
	
public static void main(String[] args) {
		NumberToWordConverter numToWord=new NumberToWordConverter();
		NumberToWordValidator validator=new NumberToWordValidator();
		long number=0;
		
			System.out.println("Enter Number");
			Scanner scan= new Scanner(System.in);
			number=scan.nextLong();
		
		try {
			if((validator.negativeNumberValidator(number)) && (validator.alphaNumericValidator(number)))
			{
				String word=numToWord.convert(number);
				System.out.println("Number Converted to word is : " + word);
			}
		} catch (NumberToWordException e) {
			scan.close();
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
