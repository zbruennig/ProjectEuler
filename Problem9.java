public class Problem9
{
	public static void main(String[] args)
	{
		for(int i=1; i<1000; i++)
		{
			for(int j=i; j<1000; j++)
			{
				int a = i;
				int b = j;
				int c = 1000 - a - b;
				if(c>0 && isPythagoreanTriplet(a,b,c) && a+b+c==1000)
				{
					System.out.println(a*b*c);
				}
			}
		}
	}
	
	public static boolean isPythagoreanTriplet(int a, int b, int c)
	{
		return a*a + b*b == c*c;
	}
}
