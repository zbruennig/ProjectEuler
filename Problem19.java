public class Problem19
{
	public static void main(String[] args)
	{
		int days = 1;
		int sundays = 0;
		for(int year = 1901; year<=2000; year++)
		{
			days++;		//jan
			if(days%7==0)
				sundays++;
			days+=30;
			
			days++;		//feb
			if(days%7==0)
				sundays++;
			if(year%4==0)
				days+=28;
			else
				days+=27;
			
			days++;		//march
			if(days%7==0)
				sundays++;
			days+=30;
			
			days++;		//april
			if(days%7==0)
				sundays++;
			days+=29;
			
			days++;		//may
			if(days%7==0)
				sundays++;
			days+=30;
			
			days++;		//june
			if(days%7==0)
				sundays++;
			days+=29;
			
			days++;		//july
			if(days%7==0)
				sundays++;
			days+=30;
			
			days++;		//august
			if(days%7==0)
				sundays++;
			days+=30;
			
			days++;		//september
			if(days%7==0)
				sundays++;
			days+=29;
			
			days++;		//october
			if(days%7==0)
				sundays++;
			days+=30;
			
			days++;		//november
			if(days%7==0)
				sundays++;
			days+=29;
			
			days++;		//december
			if(days%7==0)
				sundays++;
			days+=30;
		}
		System.out.println(sundays);
	}
	
}
