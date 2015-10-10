public class Fibo_Gen
{
	public static void main(String[] args)
	{
		Stopwatch stopwatch=new Stopwatch();
		int a=0;
		int b=1;
		int t;
		int N=Integer.parseInt(args[0]);
		//int[] odd_ducks= new int[N];
		int sum_odd_ducks=0;

		while (N-->0)
		{
			t=a;
			a=b;
			b+=t;
			System.out.println("Fibo gen: "+a);

			if(a%2!=0){sum_odd_ducks=sum_odd_ducks+a;}


		
		}
		
		

		System.out.println("Sum of all odd numbers: "+sum_odd_ducks);
		double time = stopwatch.elapsedTime();
		System.out.println("Total running time: "+time);
	}
}
