// takes two int values N and O from the command line and prints a random integer between N and O.

public class TwoNums
{
	public static void main(String args[])
	{
	int N=Integer.parseInt(args[0]);
	int O=Integer.parseInt(args[1]);
	int P=Math.max(N,O);
	int Q=Math.min(N,O);
	int number=Q+(int)(Math.random()*((P-Q)+1));
	System.out.println(number);
	}
}
