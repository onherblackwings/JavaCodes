import java.util.Arrays;
public class Max_Val
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
			
		}
		System.out.println(Arrays.toString(A));
		
		int temp=A[0];
		int max=0;
		int loc=0;
		for(int ctr=1;ctr<N;ctr++)
			{
				if(A[ctr]>temp){temp=A[ctr];max=temp;loc=ctr;}
				else{max=temp;}
			}





		System.out.println("Max Val: "+max+" is at location: "+loc);	
		double time = stopwatch.elapsedTime();
		System.out.println("Total running time: "+time);
		


	}
}