public class Sample
{
	public static void main(String[] args)
	{
		//prints a random sample of M integers
		//from 0 to N-1
		Stopwatch stopwatch=new Stopwatch();
		int M=Integer.parseInt(args[0]);
		int N=Integer.parseInt(args[1]);
		int[] perm=new int[N];

		//initialize perm[]
		for(int j=0;j<N;j++)
			{perm[j]=j;}//System.out.println(perm[j]);}

		//Take sample
		for(int i=0;i<M;i++)
		{
			//Exchange perm[i] with a random element to its right
			int r=i+(int)(Math.random()*(N-1));
			//int r=4;
			int t=perm[r];
			perm[r]=perm[i];
			perm[i]=t;
			//System.out.println(perm[i]);
		}	

		//Print Sample
		for (int i=0;i<M;i++){System.out.print(perm[i]+" ");}
		
			
		double time = stopwatch.elapsedTime();
		
		System.out.println("Total running time: "+time);

	}
	
}