import java.util.* ;
public class AddToDigit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		String num = scan.next();
		//Add one to each of the digits of the number
		//1. Via an array
		//Difference between int[] and Int[] ?
		//String vs an array
		//int[] NumArray = new int[20];
		//NumArray[0] = 10;
		//NumArray[1] = 12;
		//System.out.println(Arrays.toString(NumArray));
		for(int i = 0; i<num.length();i++)
		{
			System.out.println("" + num[i]);
		}
	}
}