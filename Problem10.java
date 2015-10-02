public class Problem10
{
	public static void main(String[] args)
	{
		int currnum = 2;
		int divisor = 2;
		int countTo = 2000000;
		long sum = 0;
		
		while(currnum<countTo)
		{	
			if(currnum == divisor)
				{sum+=currnum; System.out.println(currnum);}
			if(currnum%divisor == 0)
				{currnum++; divisor = 1;}
			divisor++;
		}
		System.out.println(sum);
		//this takes forever
	}	
}

