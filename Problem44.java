import java.util.ArrayList;

/**
 * Created by Zachary on 12/31/2015.
 */
public class Problem44
{
    //Takes about 15 minutes to complete
    public static void main(String[] args)
    {
        ArrayList<Integer> pentagonals = new ArrayList<Integer>();
        for(int i=1; i<10000; i++) //hopefully the answer is within the first 10000
        {
            int next = ((3*i) - 1)*i/2;
            pentagonals.add(next); //generates all pentagonals below 10^20, and the first one above it
        }
        //System.out.println(pentagonals);

        int lowestDifference = Integer.MAX_VALUE;
        int firstIndex = 0;
        int secondIndex = 0;

        for(int i=0; i<pentagonals.size()-1; i++)
        {
            for(int j=i+1; j<pentagonals.size() && j-i < lowestDifference; j++)
            {
                int sum = pentagonals.get(j) + pentagonals.get(i);
                int difference = pentagonals.get(j) - pentagonals.get(i); //this should always be positive
                if(pentagonals.contains(sum) && pentagonals.contains(difference))
                {
                    lowestDifference = j-i;
                    firstIndex = i;
                    secondIndex = j;
                    System.out.println("Found one!");
                    break; //This break is useless because lowestDifference updates.
                    //Too late to fix it now, already submitted my answer.
                }
            }
            System.out.println("i:"+i);
        }
        System.out.println(pentagonals.get(secondIndex)-pentagonals.get(firstIndex));
    }
}
