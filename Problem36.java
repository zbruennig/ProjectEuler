/**
 * Created by Zachary on 7/17/2015.
 */
public class Problem36
{
    public static void main(String[] args)
    {
        int sum = 1;
        for(int i=2; i<=1000000; i++)
        {
            String binary = binaryNum(i);
            String decimal = Integer.toString(i);
            if(isPalindrome(binary) && isPalindrome(decimal))
                sum+=i;
        }
        System.out.println(sum);
    }

    public static boolean isPalindrome(String str)
    {
        return str.equals(Problem4.reverse(str));
    }

    //doesn't work for 1
    public static String binaryNum(int num)
    {

        String binaryStr = "1";
        int maxNum = 1;
        while(num>=maxNum)
        {
            maxNum*=2;
        }
        maxNum/=2;
        num-=maxNum;
        maxNum/=2;

        while(maxNum!=1)
        {

            if(maxNum<=num)
            {
                binaryStr+="1";
                num-=maxNum;
            }
            else
            {
                binaryStr+="0";
            }
            maxNum/=2;
        }
        binaryStr+=num;
        return binaryStr;
    }
}
