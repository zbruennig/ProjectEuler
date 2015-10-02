import java.util.ArrayList;

public class Problem12 
{
	public static void main(String[] args)
	{
		boolean done = false;
		for(int i=1; done==false; i++)
		{
			int triangularNumber = getTriangularNumber(i);
			ArrayList<Integer> primeFactors = getPrimeFactors(triangularNumber);
			int numberFactors = numberOfFactors(primeFactors);
			if(numberFactors>500)
			{
				System.out.println(triangularNumber);
				break;
			}
		}
	}
	
	public static int numberOfFactors(ArrayList<Integer> primeFactors)
	{
		ArrayList<Integer> numOfNums = new ArrayList<Integer>();
		int currentNum = -1;
		int numFactors = 1;
		while(primeFactors.size()>0)
		{
			if(primeFactors.get(0)==currentNum)
			{
				numOfNums.set(numOfNums.size()-1, numOfNums.get(numOfNums.size()-1)+1);
				primeFactors.remove(0);
			}
			else
			{
				numOfNums.add(2); 
				currentNum = primeFactors.get(0);
				primeFactors.remove(0);
				//the formula for finding # of factors is the product of all (the number of times the prime occurs in
				// prime factorization + 1)... this takes care of the +1
			}
		}
		for(int i=0; i<numOfNums.size(); i++)
		{
			numFactors*=numOfNums.get(i);
		}
		return numFactors;
	}
	
	public static ArrayList<Integer> getPrimeFactors(int num)
	{ //returns prime factors in order, from smallest to largest
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int factor = 2;
		while(num!=1)
		{
			if((num%factor) == 0)
			{
				num=num/factor;
				nums.add(factor);
				factor=1;
			}
			factor++;
		}
		return nums;
	}
	
	public static int getTriangularNumber(int num)
	{
		return num*(num+1)/2;
	}
	
}
