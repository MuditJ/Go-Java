	import java.util.*;
	import java.io.*;

	public class RevisedJulianCalendar {
		public static void main(String[] arg) {
			//Scanner read = new Scanner(System.in);
			int Year1 = Integer.parseInt(arg[0]);
			int Year2 = Integer.parseInt(arg[1]);
			System.out.println("You entered:" + Year1 + " and " + Year2);
			System.out.println("" + Solution.NumOfYears(Year1,Year2));
		}
	}

	class Solution {
		public static int NumOfYears(int Year1, int Year2) {
			int count = 0;
			int current_year = 0;
			if(Year1 %4 == 0)
			{
				if(Year1 % 100 != 0 || (Year1 % 100 == 0 && (Year1 % 900 == 200 || Year1 % 900 == 600))) {
					count += 1;
					current_year = Year1+4;

				}
				else
				{
				current_year = Year1 + 4;
				}
			}
			else
			{
				current_year = (Year1 - Year1%4) + 4;
			}
		while(current_year <= Year2)
		{
			if(current_year % 4 == 0)
			 {
			 	if (current_year % 100 != 0 || (current_year % 100 == 0 && (current_year % 900 == 200 || current_year % 900 == 600)))
			 		count += 1;
			 }
			 current_year += 4;
			 	
		}
		return count;

		}
	}