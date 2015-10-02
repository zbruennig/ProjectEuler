/**
 * Created by Zachary on 7/12/2015.
 */
public class Problem28
{
    public static void main(String[] args)
    {
        System.out.println(spiralDiagonalSum(1001));
    }

    //only works if length is odd
    public static int spiralDiagonalSum(int length)
    {
        if(length==1)
        {
            return 1;
        }
        if(length==2)
            return 10;
        return spiralDiagonalSum(length-2) + (length*length) + (length*length-(length-1)) + (length*length-(2*(length-1))) + (length*length-(3*(length-1)));
    }
}
