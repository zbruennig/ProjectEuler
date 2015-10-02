public class Problem21
{
	public static void main(String[] args)
	{
		int amicableSum = 0;
		for(int i=2; i<10000; i++)
		{
			int factors = factorSum(i);
			if(factorSum(factors)==i && factors!=i)
			{
				amicableSum+=i;
			}
		}
		System.out.println(amicableSum);
	}
	
	public static int factorSum(int num)
	{
		int sum = 0;
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
				sum+=i;
		}
		return sum;
	}
}
