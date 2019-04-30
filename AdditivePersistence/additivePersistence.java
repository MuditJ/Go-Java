	import java.util.*;
	public class additivePersistence {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number:");
			String num = s.next(); //Reads input 
			int iterations = getIterations(num);
			System.out.println("The additive persistence is" + iterations);
		}
		static int getIterations(String num) {
			int count = 0;
			Integer sum = 0;
			do {
				sum = 0; //Set sum's value to 0 every iteration
				for(int i = 0; i < num.length(); i++) {
					int n = Integer.parseInt(Character.toString(num.charAt(i)));
					sum += n;
				}
				count += 1;
				num = sum.toString();
			}
			while (sum / 10 > 0);
		return count;
		}
	}