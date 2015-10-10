public class CouponCollector
{
    public static void main(String[] args)
    {
        Stopwatch stopwatch=new Stopwatch();
        int N=Integer.parseInt(args[0]);
        boolean[] found=new boolean[N];
        int cardcnt=0, valcnt=0;
        
        while (valcnt<N)
        {
            int val=(int) (Math.random()*N);
            cardcnt++;
            if(!found[val]){valcnt++;found[val]=true;}
                 
        }
        System.out.println(cardcnt);
        double time = stopwatch.elapsedTime();
        System.out.println(time);
    }
}