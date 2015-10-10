public class AscendSort
{
	public static void main(String[] args)
	{
		Stopwatch stopwatch = new Stopwatch();   
		int N=Integer.parseInt(args[0]);
		int[] A=new int[N];

		for (int i=0;i<N;i++)
		{
			double r=Math.random();
			int n=(int) (r*N);
			A[i]=n;
		
			//System.out.println(r);
			//System.out.println("A["+i+"]="+A[i]);
		}
		int temp=A[0];
		int max=0;
		for(int ctr=1;ctr<N;ctr++)
			{
				if(A[ctr]>temp){temp=A[ctr];max=temp;}
				else{max=temp;}
			}





		System.out.println("Max Val: "+max);	
		double time = stopwatch.elapsedTime();
		System.out.println("Total running time: "+time);
		


	}
}