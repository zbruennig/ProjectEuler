/**
 * Created by Zachary on 7/18/2015.
 */
public class Problem40
{
    public static void main(String[] args)
    {
        int numbersSoFar = 0;
        int[] toReach = new int[]{1,10,100,1000,10000,100000,1000000};
        int curr = 0;

        int product = 1;

        for(int i=1; curr<7; i++)
        {
            if(numbersSoFar+Integer.toString(i).length()>=toReach[curr])
            {
                String numString = Integer.toString(i);
                int start = toReach[curr]-numbersSoFar-1;

                product*=Integer.parseInt(numString.substring(start,start+1));

                curr++;
            }
            numbersSoFar+=Integer.toString(i).length();
        }
        System.out.println(product);
    }
}
