public class Problem17
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i=1; i<=1000; i++)
		{
			String stringForm = Integer.toString(i);
			String words = toWords(stringForm);
			words = words.replaceAll("\\W","");
			System.out.println(words);
			sum+=words.length();
		}
		System.out.println(sum);
	}
	
	public static String toWords(String num)
	{
		if(num.length()==4)
		{
			return "one thousand";
		}
		
		if(num.length()==3)
		{
			if(num.substring(1,3).equals("00"))
				return toWords(num.substring(0,1)) + "hundred";
			return toWords(num.substring(0,1)) + "hundred and" + toWords(num.substring(1,3));
		}
		
		if(num.length()==1)
		{
			if(num.equals("1"))
				return "one";
			if(num.equals("2"))
				return "two";
			if(num.equals("3"))
				return "three";
			if(num.equals("4"))
				return "four";
			if(num.equals("5"))
				return "five";
			if(num.equals("6"))
				return "six";
			if(num.equals("7"))
				return "seven";
			if(num.equals("8"))
				return "eight";
			if(num.equals("9"))
				return "nine";
		}
		
		if(num.length()==2)
		{
			if(num.substring(0,1).equals("0"))
				return toWords(num.substring(1,2));
			if(num.equals("10"))
				return "ten";
			if(num.equals("11"))
				return "eleven";
			if(num.equals("12"))
				return "twelve";
			if(num.equals("13"))
				return "thirteen";
			if(num.equals("18"))
				return "eighteen";
			if(num.equals("15"))
				return "fifteen";
			if(num.substring(0,1).equals("1"))
				return toWords(num.substring(1,2)) + "teen";
			if(num.substring(0,1).equals("2"))
				return "twenty" + toWords(num.substring(1,2));
			if(num.substring(0,1).equals("3"))
				return "thirty" + toWords(num.substring(1,2));
			if(num.substring(0,1).equals("4"))
				return "forty" + toWords(num.substring(1,2));
			if(num.substring(0,1).equals("5"))
				return "fifty" + toWords(num.substring(1,2));
			if(num.substring(0,1).equals("6"))
				return "sixty" + toWords(num.substring(1,2));
			if(num.substring(0,1).equals("7"))
				return "seventy" + toWords(num.substring(1,2));
			if(num.substring(0,1).equals("8"))
				return "eighty" + toWords(num.substring(1,2));
			if(num.substring(0,1).equals("9"))
				return "ninety" + toWords(num.substring(1,2));
				
		}
		return "";
	}
}
