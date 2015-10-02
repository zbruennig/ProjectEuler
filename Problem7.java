public class Problem7
{
	public static void main(String[] args)
	{
		int currentNum = 2;
		for(int i=0; i<10001; i++)
		{
			while(currentNum!=Problem3.getSmallestFactor(currentNum))
			{
				currentNum++;
			}
			
			if(i==10000)
			{
				System.out.println(currentNum);
			}
			currentNum++;
		}
	}
}
