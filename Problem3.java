public class Problem3
{
	public static void main(String[] args)
	{
		long num = 600851475143L;
		while(num!=1)
		{
			System.out.println(getSmallestFactor(num));
			num = num/getSmallestFactor(num);
		}
		
	}
	//except 1
	public static long getSmallestFactor(long num)
	{
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				return i;
			}
		}
		return num;
	}
	
	public static int getSmallestFactor(int num)
	{
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				return i;
			}
		}
		return num;
	}
}