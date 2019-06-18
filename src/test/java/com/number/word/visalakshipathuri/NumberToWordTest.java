package com.number.word.visalakshipathuri;
import org.junit.Test;

import com.number.word.service.NumberToWordConverter;

import junit.framework.TestCase;

public class NumberToWordTest extends TestCase {
	
	
	private String word1 = " one thousand ten hundred eleven";
	private String word2 = " twenty five";
	private String negMsg="Number must not be negative";
	public String alphaNumericMsg="Number Must not be alphanumeric";
	@Test
	public void testConvert() {
		String number1= new NumberToWordConverter().convert(1111);
		System.out.println(number1);
		//if both number1 and word1 are equal then it will execute further line
		//else it throw exception
		assertEquals(number1,word1) ;
		
		String number2= new NumberToWordConverter().convert(25);
		System.out.println(number2);
		assertEquals(number2,word2) ;
		
		String number3= new NumberToWordConverter().convert(-1);
		System.out.println(number3);
		assertEquals(number3,negMsg) ;
		
		String number4= new NumberToWordConverter().convert(8888);
		System.out.println(number4);
		assertEquals(number4,alphaNumericMsg) ;
	}
	
	

}
