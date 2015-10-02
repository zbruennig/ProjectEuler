public class Problem14
{
	public static void main(String[] args)
	{
		long maxLength = -1;
		long maxStart = -1;
		for(long i=1; i<1000000; i++)
		{
			long currLength = collatz(i);
			if(currLength>maxLength)
			{
				maxLength = currLength;
				maxStart = i;
			}
			System.out.println(i+": "+currLength);
		}
		System.out.println(maxStart);
		System.out.println(maxLength);
	}
	
	
	public static long collatz(long num)
	{
		long steps = 1;
		while(num!=1)
		{
			if(num%2==0)
			{
				num = num / 2;
			}
			else
			{
				num = 3*num + 1;
			}
			steps++;
		}
		return steps;
	}
	
}
