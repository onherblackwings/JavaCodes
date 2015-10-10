import java.util.Arrays;
public class Seq_Search
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

		int[] found=new int[N];
		int NumberToFind=Integer.parseInt(args[1]);
		int j=0;
		while(j<N)
		{
			if(A[j]==NumberToFind){System.out.println(NumberToFind+" found at location: "+j);j=j+1;}
			else{j=j+1;}
		}





		double time = stopwatch.elapsedTime();
		System.out.println("Total running time: "+time);
		


	}
}