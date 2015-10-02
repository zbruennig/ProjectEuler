import java.util.Scanner;

/**
 * Created by Zachary on 9/25/2015.
 */
public class ParenthesesMatching
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[] inputs = new String[4];
        for(int i=0; i<4; i++)
            inputs[i] = in.nextLine();
        for(int i=0; i<4; i++)
            System.out.println(isValid(inputs[i]));
    }

    public static boolean isValid(String str)
    {
        if(str.equals(""))
            return true;
//        System.out.println(str);
        String balancing = str;
        for(int i=0; i<str.length()-1; i++)
        {
            if(balancing.substring(i,i+2).equals("()") || balancing.substring(i,i+2).equals("[]") ||  balancing.substring(i,i+2).equals("{}"))
                return isValid(str.substring(0,i)+str.substring(i+2,balancing.length()));
        }
        return false;

    }
}
