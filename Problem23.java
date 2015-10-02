import java.util.ArrayList;

/**
 * Created by Zachary on 7/12/2015.
 */
public class Problem23
{
    public static void main(String[] args)
    {
        ArrayList<Integer> abundantNums = new ArrayList<Integer>();
        int sum = 0;
        for(int i=2; i<28123; i++)
        {
            if (isAbundant(i))
                abundantNums.add(i);
        }

        for(int i=1; i<28124; i++)
        {
         //   System.out.println(i);
            for(int j=0; j<abundantNums.size(); j++)
            {
                if(i-abundantNums.get(j)<0)
                    break;
                if(abundantNums.contains(i-abundantNums.get(j)))
                {
                    sum+=i;
                    break;
                }
            }
        }
        System.out.println((28123*28124/2)-sum);
    }

    public static boolean isAbundant(int num)
    {
        int factorSum = 0;
        for(int i=1; i<num; i++)
        {
            if(num%i==0)
                factorSum+=i;
        }
        return factorSum > num;
    }
}
