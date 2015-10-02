import java.util.ArrayList;

/**
 * Created by Zachary on 7/27/2015.
 */
public class Problem56
{
    public static void main(String[] args)
    {
        int maxSum=-1;
        for(int i=2; i<100; i++)
        {
            for(int j=2; j<100; j++)
            {
                ArrayList<Integer> exponent = bigPow(i,j);
                int sum = sum(exponent);
                if(sum>maxSum)
                    maxSum=sum;
            }
        }
        System.out.println(maxSum);
    }

    public static ArrayList<Integer> bigPow(int base, int pow)
    {
        ArrayList<Integer> bigNum = new ArrayList<Integer>();
        bigNum.add(1);
        for(int i=0; i<pow; i++)
        {
            for(int j=0; j<bigNum.size(); j++)
            {
                bigNum.set(j, bigNum.get(j)*base);
            }
            bigNum = Problem25.carry(bigNum);
        }
        return bigNum;
    }

    public static int sum(ArrayList<Integer> digits)
    {
        int sum = 0;
        for(int i=0; i<digits.size(); i++)
        {
            sum+=digits.get(i);
        }
        return sum;
    }
}
