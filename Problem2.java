public class Problem2
{
	public static void main(String[] args)
	{
		int sum = 0;
		int first = 1;
		int second = 2;
		int current = nextFib(first,second);
		while(current<4000000)
		{
			System.out.println(current);
			if(current%2==0)
				sum+=current;
			first=second;
			second=current;
			current = nextFib(first,second);
		}
		System.out.println(sum+2);
	}
	
	private static int nextFib(int first, int second)
	{
		return second+first;
	}
}
