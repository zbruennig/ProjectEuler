public class Problem4
{
	public static void main(String[] args)
	{
		int start = 900;
		int firstNum = start;
		int secondNum = start;
		int largestNum = -1;
		
		while(true)
		{
			if(firstNum == 999 && secondNum == 999)
				break;
			if(firstNum == 999)
			{
				firstNum=start;
				secondNum++;
			}
			int product = firstNum*secondNum;
			String productStr = Integer.toString(product);
			if(productStr.equals(reverse(productStr)) && product>largestNum)
				largestNum=product;
			
			firstNum++;
		}
		System.out.println(largestNum);
	}
	
	public static String reverse(String toReverse)
	{
		if(toReverse.length()<2)
			return toReverse;
		
		String first = toReverse.substring(0,1);
		String last = toReverse.substring(toReverse.length()-1,toReverse.length());
		return last + reverse(toReverse.substring(1,toReverse.length()-1)) + first;
	}
}
