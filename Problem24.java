/**
 * Created by Zachary on 7/12/2015.
 */
public class Problem24
{
    /*
    0 1 2 3 4 5 6 7 8 9
    0 1 2 3 4 5 6 7 9 8
    0 1 2 3 4 5 6 8 7 9

    10! = 3628800
    9! = 362880
    8! = 40320
    7! = 5040
    6! = 720
    5! = 120
    4! = 24
    3! = 6
    2! = 2

    Here's how to solve it.

    start with
    0123456789

    How many times does 9! go into 1000000? 2.
    Swap the 0 with the digit 2 to the right of it.

    2103456789

    Then rearrange everything to the right of the digit the 0 swapped with, to be in lowest to highest order

    2013456789

    1000000 - 9! - 9! = 274240
    How many times does 8! go into 274240? 6
    Swap the 0 with the digit 6 to the right of it

    2713456089

    Rearrange everything right of the 7

    2701345689

    274240 - 6*8! = 32320

    How many times does 7! go into 32320... etc...

    You end up with 2783915604, but we forgot to include the first permutation, 0123456789, in our count
    So we find the number that comes right before this permutation, which is

    2783915460


     */
}
