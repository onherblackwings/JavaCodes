public class ThreeNumSort
{
	public static void main(String args[])
	{
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=Integer.parseInt(args[2]);
	int t;

	if(a>b){t=a;a=b;b=t;}
	else if(a>c){t=a;a=c;c=t;}
	else if(b>c){t=b;b=c;c=t;}
	else{a=a;b=b;c=c;}

	System.out.println(a);
	System.out.println(b);
	System.out.println(c);



	
	}
}
