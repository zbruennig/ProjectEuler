/**
 * Created by Zachary on 7/27/2015.
 */
public class Problem112
{
    public static void main(String[] args)
    {
        int bouncy = 0;
        int notBouncy = 1;
        for(int i=2; true; i++)
        {
            if(isBouncy(i))
                bouncy++;
            else
                notBouncy++;

            if(notBouncy*99==bouncy)
            {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean isBouncy(int num)
    {
        String numStr = Integer.toString(num);

        for(int i=0; i<numStr.length()-1; i++)
        {
            if(numStr.substring(i,i+1).equals(numStr.substring(i+1,i+2)))
            {
                numStr = numStr.substring(0,i)+numStr.substring(i+1,numStr.length());
                i--;
            }
        }

        for(int i=1; i<numStr.length()-1; i++)
        {
            int before = Integer.parseInt(numStr.substring(i-1, i));
            int current = Integer.parseInt(numStr.substring(i,i+1));
            int after = Integer.parseInt(numStr.substring(i+1,i+2));
            if((current>before && current>after) || (current<before && current<after))
            {
                return true;
            }
        }
        return false;
    }
}
