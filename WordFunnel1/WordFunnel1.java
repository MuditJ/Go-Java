import java.lang.Math;
public class WordFunnel1 {
	public static void main(String[] args) {
		String word1 = args[0];
		String word2 = args[1];
		boolean ans = Solution.solve(word1,word2);
		boolean ans2 = Solution.solve_1(word1,word2);
		System.out.println(ans);
		System.out.println(ans2);
	}
}

class Solution {
	public static boolean solve(String a, String b) {
		int a_length = a.length();
		int b_length = b.length();
		if (a_length - b_length != 1) return false;
		else 
		{
			int x = 0;
		for(int count = 0; x < b_length; x++) {
			if(b.charAt(x) == a.charAt(x))
				continue;
			else
				count += 1;
			if(count > 1)
				break;
		}
		if(x == b_length)
			return true;
		else 
		{
			 x = 0;
			for(int count = 0; x < b_length; x++) {
			if(b.charAt(x) == a.charAt(x+1))
				continue;
			else
				count += 1;
			if(count > 1)
				break;
		}
		if(x == b_length) return true;
		else return false;
		}
	}
}

public static boolean solve_1(String a, String b) {
	//Shorter more concise solution
	if (a.length() - b.length() != 1) 
		return false;
	else
	{
		for(int i = 0; i < b.length(); i++ )
		{
			if((a.substring(0,i) + a.substring(i+1)).equals(b))
				return true;
			else continue;
		}
		return false;
	}
}

}
