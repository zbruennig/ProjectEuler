import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Zachary on 8/30/2015.
 */
public class Problem206
{
    public static void main(String[] args)
    {
        for(int i=1000000000; i<1414213563; i+=10)
        {
            ArrayList<Integer> first = new ArrayList<Integer>();
            String numStr = Integer.toString(i);
            for(int j=0; j<numStr.length(); j++)
            {
                first.add(Integer.parseInt(numStr.substring(j,j+1)));
            }
            ArrayList<Integer> second = first;
            ArrayList<Integer> total = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));

            for(int j=0; j<first.size(); j++)
            {
                for(int k=0; k<second.size(); k++)
                {
                    total.set(18-(j+k),total.get(18-(j+k))+(first.get(j)*second.get(k)));
                }
            }
            total = Problem25.carry(total);

            //System.out.println(total);

            if(total.get(18).equals(1) && total.get(16).equals(2) && total.get(14).equals(3) && total.get(12).equals(4) && total.get(10).equals(5)
                    && total.get(8).equals(6) && total.get(6).equals(7) && total.get(4).equals(8) && total.get(2).equals(9) && total.get(0).equals(0))
            {
                System.out.println(i);
                break;
            }
        }
    }
}
