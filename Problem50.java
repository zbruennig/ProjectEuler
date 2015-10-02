import java.util.ArrayList;

/**
 * Created by Zachary on 8/14/2015.
 */
public class Problem50
{
    public static void main(String[] args)
    {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i=2; i<1000000; i++)
        {
            if(Problem49.isPrime(i))
                primes.add(i);
        }

        int longestRun = -1, longestSum = -1;

        for(int i=0; i<primes.size(); i++)
        {
            int sum = 0;
            for(int j=i; j<primes.size(); j++)
            {
                sum+=primes.get(j);
                if(sum>1000000)
                    break;
                if(Problem49.isPrime(sum) && j-i>longestRun)
                {
                    longestRun = j-i;
                    longestSum = sum;
                }
            }
        }
        System.out.println(longestSum);
    }
}
