/**
 * Created by Zachary on 7/12/2015.
 */
public class Problem30
{
    public static void main(String[] args)
    {
        int totalSum = 0;
        for(int i=2; i<=354294; i++)
        {
            String words = Integer.toString(i);
            int[] digits = new int[words.length()];
            for(int j=0; j<digits.length; j++)
            {
                digits[j] = Integer.parseInt(words.substring(j,j+1));
            }

            int sum = 0;

            for(int j=0; j<digits.length; j++)
            {
                sum += (int) Math.pow(digits[j], 5);
            }
            if(sum==i)
                totalSum+=i;
        }
        System.out.println(totalSum);
    }
}
