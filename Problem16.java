import java.util.ArrayList;

public class Problem16 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> digits = new ArrayList<Integer>();
		digits.add(1);

		final int POWER = 1000;
		
		for(int i=0; i<POWER; i++)
		{
			for(int j=0; j<digits.size(); j++)
			{
				digits.set(j, 2*digits.get(j));
			}
			//the following became its own method in Problem25
			for(int j=0; j<digits.size()-1; j++)
			{
				int carry = digits.get(j)/10;
				int remainder = digits.get(j)%10;
				digits.set(j+1, carry+digits.get(j+1));
				digits.set(j, remainder);
			}
			
			if(digits.get(digits.size()-1) >= 10)
			{
				digits.add(1);
				digits.set(digits.size()-2, digits.get(digits.size()-2)%10);
			}
			//end following

		}
		int sum = 0;
		for(int i=0; i<digits.size(); i++)
		{
			sum+=digits.get(i);
		}
		System.out.println(sum);
	}
}
