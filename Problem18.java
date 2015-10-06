import java.util.Scanner;

public class Problem18 
{
	public static void main(String[] args)
	{
		int rows = 100;
		int[][] pyramid = new int[rows][rows];
		Scanner kb = new Scanner(System.in);
		
		for(int i=0; i<rows; i++)
		{
			String input = kb.nextLine();
			String[] sorter = new String[i+1];
			for(int j=0; j<i+1; j++)
			{
				sorter[j] = input.substring(j*3, 2+j*3);
				pyramid[i][j] = Integer.parseInt(sorter[j]);
			}
		}
		
		for(int i=rows-2; i>=0;i--)
		{
			for(int j=0; j<rows-1; j++)
			{
				if(pyramid[i+1][j]>pyramid[i+1][j+1])
				{
					pyramid[i][j]+=pyramid[i+1][j];
				}
				else
				{
					pyramid[i][j]+=pyramid[i+1][j+1];
				}
			}
		}
		System.out.println(pyramid[0][0]);
	}
}
/*
	
75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
	
*/	
	
	
	
	
	
	
	
	
/*

				HOW IT WORKS
				
				6
				5 8
				9 4 7
				7 3 2 9
				4 6 8 5 1
			>	2 3 5 6 7 9
				
				BECOMES
				
				6
				5 8
				9 4  7
				7 3  2  9
			>	7 11 14 12 10
				
				WHICH BECOMES
				
				6
				5  8
				9  4  7
				18 17 16 21
				
				AND THEN
				
				6
				5  8
				27 26 28
				
				THEN
				
				6
				32 36
				
				AND FINALLY
				
				42
*/ 