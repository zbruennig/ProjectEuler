/**
 * Created by Zachary on 8/10/2015.
 */
public class Problem71
{
    public static void main(String[] args)
    {
        final double target = 3.0/7.0;
        double best = 0;
        int numerator = 0;

        int n = 3;
        double d = 8;
        while(d<=1000000)
        {

            double current = n/d;
            if(current>=target)
                d++;
            else
            {
                if(current>best)
                {
                    numerator = n;
                    best = current;
                }
                n++;
            }
        }

        System.out.println(numerator);
    }
}
