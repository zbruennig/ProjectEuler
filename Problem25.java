import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Zachary on 7/12/2015.
 */
public class Problem25

    //THIS ONE HAS THE CARRY METHOD
{
    public static void main(String[] args)
    {
        ArrayList<Integer> firstNum = new ArrayList<Integer>();
        firstNum.add(1);

        ArrayList<Integer> secondNum = new ArrayList<Integer>();
        secondNum.add(1);

        ArrayList<Integer> currentNum = new ArrayList<Integer>();

        int index = 2;
        while(currentNum.size()<1000)
        {
            index++;
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int i=0; i<secondNum.size(); i++)
                temp.add(secondNum.get(i));
            for(int i=0; i<firstNum.size(); i++)
                temp.set(i, temp.get(i) + firstNum.get(i));
            temp = carry(temp);
            currentNum = temp;
            firstNum = secondNum;
            secondNum = temp;
        }
        System.out.println(index);
    }

    public static ArrayList<Integer> carry(ArrayList<Integer> digits)
    {
        for(int j=0; j<digits.size()-1; j++)
        {
            int carry = digits.get(j)/10;
            int remainder = digits.get(j)%10;
            digits.set(j+1, carry+digits.get(j+1));
            digits.set(j, remainder);
        }

        while(digits.get(digits.size()-1) >= 10)
        {
            digits.add(digits.get(digits.size()-1)/10);
            digits.set(digits.size()-2, digits.get(digits.size()-2)%10);
        }
        return digits;
    }
}
