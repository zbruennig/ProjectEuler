import java.util.ArrayList;

public class Problem20 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> digits = new ArrayList<Integer>();
		digits.add(1);
		
		for(int i=1; i<100; i++)
		{
			for(int j=0; j<digits.size(); j++)
			{
				digits.set(j, i*digits.get(j));
			}
			
			for(int j=0; j<digits.size()-1; j++)
			{
				int carry = digits.get(j)/10;
				int remainder = digits.get(j)%10;
				digits.set(j+1, carry+digits.get(j+1));
				digits.set(j, remainder);
			}
			
			while(digits.get(0)==0)
			{
				digits.remove(0);
			}
			
			while(digits.get(digits.size()-1)>=10)
			{
				String finalNum = Integer.toString(digits.get(digits.size()-1));
				String hold = finalNum.substring(finalNum.length()-1, finalNum.length());
				String transfer = finalNum.substring(0, finalNum.length()-1);
				digits.remove(digits.size()-1);
				digits.add(Integer.parseInt(hold));
				digits.add(Integer.parseInt(transfer));
			}
			
		}
		int sum = 0;
		for(int i=0; i<digits.size(); i++)
		{
			sum+=digits.get(i);
		}
		System.out.println(sum);
	}
}
