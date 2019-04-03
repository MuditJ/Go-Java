public class game_of_threes {
	public static void main(String[] args) {
		System.out.println("Solving a question");
		int Input = Integer.parseInt(args[0]);
		while(Input != 1)
		{
			int res = Input %3;
			if(res == 0) {
				System.out.println(Input + " " + res);
				Input /= 3;
			}
			else {
				if(res == 2)
				{
					System.out.println(Input + " " + 1);
					Input += 1;
					Input /= 3;
				}
				else {
					System.out.println(Input + " " + -1);
					Input -=1;
					Input /= 3;
				}

				}
	}
	System.out.println("" + 1);
}

}