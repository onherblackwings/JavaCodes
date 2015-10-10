public class PepysProblem
{
	public static void main(String[] args)
	{
		int counter_6=0;
		int counter_12=0;
		Stopwatch stopwatch = new Stopwatch();   

		System.out.println("6 dice rolls rolled 100000 times: ");

		for (int roll=1;roll<=100000;roll++)
		{
			
			for (int i=0;i<6;i++)
			{
				double r=Math.random();
				int n=(int) (r*7);

				if (n==0)
					{
						n=n+1; 
						counter_6=counter_6+1;
						System.out.println("Roll ["+i+"]:"+n);
					}
				else if(n==1)
					{counter_6=counter_6+1;System.out.println("Roll ["+i+"]:"+n);}

				
			}



		}


		
		System.out.print("IF we roll the dice 6 times, we get "+counter_6+" ones.");
		System.out.println();		

		System.out.println();
		System.out.println("12 dice rolls: ");


		System.out.println("12 dice rolls rolled 10000 times: ");

		for (int roll=1;roll<=100000;roll++)
		{
			
			for (int i=0;i<12;i++)
			{
				double r=Math.random();
				int n=(int) (r*7);

				if (n==0){n=n+1; counter_12=counter_12+1;System.out.println("Roll ["+i+"]:"+n);}
				else if(n==1){counter_12=counter_12+1;System.out.println("Roll ["+i+"]:"+n);}

				
			}



		}

		System.out.print("IF we roll the dice 6 times 100000 times, we get "+counter_6+" ones.");
		System.out.println();		

		System.out.print("IF we roll the dice 12 times 100000 times, we get "+counter_12+" ones.");
		System.out.println();		

		
		double time = stopwatch.elapsedTime();
		System.out.println("Total running time: "+time);
	}
}