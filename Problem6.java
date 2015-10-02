public class Problem6
{
	public static void main(String[] args)
	{
		System.out.println(squareSum(100) - sumSquare(100));
	}
	
	public static int squareSum(int num)
	{
		int sum = num*(num+1)/2;
		return (int) Math.pow(sum,2);
	}
	
	public static int sumSquare(int num)
	{
		int total = 0;
		for(int i=0; i<=num; i++)
		{
			total+= (int) Math.pow(i, 2);
		}
		return total;
	}
	
}
