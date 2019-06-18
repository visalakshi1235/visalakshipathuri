package com.number.word.util;

public class NumberToWordUtil {

	public String removeWhiteSpaces(String result)
	{
		return result.replaceAll("^\\s+", " ").replaceAll("\\b\\s{2,}\\b", " ");
	}
}
