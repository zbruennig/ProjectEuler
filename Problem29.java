import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Zachary on 7/12/2015.
 */
public class Problem29

    //THIS ONE HAS THE POW METHOD
{
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> terms = new ArrayList<ArrayList<Integer>>();
        for(int base = 2; base<=100; base++)
        {
            for(int power = 2; power<=100; power++)
            {
                ArrayList<Integer> answer = pow(base, power);
                boolean add = true;
                for(int i=0; i<terms.size(); i++)
                {
                    if(answer.equals(terms.get(i)))
                        add = false;
                }
                if(add)
                    terms.add(answer);
            }
        }
        System.out.println(terms.size());
    }

    public static ArrayList<Integer> pow(int base, int power)
    {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(1);

        for(int times=0; times<power; times++)
        {
            for(int i=0; i<answer.size(); i++)
            {
                answer.set(i, answer.get(i)*base);
            }

            for(int j=0; j<answer.size()-1; j++)
            {
                int carry = answer.get(j)/10;
                int remainder = answer.get(j)%10;
                answer.set(j + 1, carry + answer.get(j + 1));
                answer.set(j, remainder);
            }

            while(answer.get(answer.size()-1)>=10)
            {
                String finalNum = Integer.toString(answer.get(answer.size()-1));
                String hold = finalNum.substring(finalNum.length()-1, finalNum.length());
                String transfer = finalNum.substring(0, finalNum.length()-1);
                answer.remove(answer.size()-1);
                answer.add(Integer.parseInt(hold));
                answer.add(Integer.parseInt(transfer));
            }
        }
        return answer;
    }
}
