import java.util.Arrays;
public class Reverse_Arr
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
		
		System.out.println(Arrays.toString(A));
		int cbeg=0;
		int cend=A.length-1;
		int temp=0;
		while (cbeg<A.length/2)
		{
			temp=A[cbeg];
			A[cbeg]=A[cend];
			A[cend]=temp;
			
			cbeg=cbeg+1;
			cend=cend-1;
		}


		//for (int element: A){System.out.println(element);}
		System.out.println(Arrays.toString(A));
		double time = stopwatch.elapsedTime();
		System.out.println("Total running time: "+time);
		


	}
}