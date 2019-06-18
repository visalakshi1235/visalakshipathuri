package com.number.word.constants;

public class NumberToWordConstant {

	public String mask = "000000000000";
	public String thousand =" thousand ";
	public String oneThousand =" one thousand ";
	public String million=" millions ";
	public String billion=" billion ";
	public String hundred=" hundred";
	public String zero=" zero";
	public String negMsg="Number must not be negative";
	public String alphaNumericMsg="Number Must not be alphanumeric";
	public enum tenNames {
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
		private tenNames(final String value)
		{
			this.value=value;
		}
		public String getValue()
		{
			return value;
		}
	 
     }
	
	public enum numNames {
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
		private numNames(final String value)
		{
			this.value=value;
		}
		public String getValue()
		{
			return value;
		}
			
	}
}
