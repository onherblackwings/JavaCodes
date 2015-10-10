public class gaussian
{
 public static void main(String[] args)
 {
  Stopwatch stopwatch = new Stopwatch();   
  double u=Math.random();
  double v=Math.random();
  double w1=Math.sin((2*Math.PI)*v);
  double w2=Math.pow((-2*Math.log(u)),1/2);
  double w=w1*w2;
  
  int n=(int) (w*7);
  
  System.out.println(Math.abs(n));
  double time = stopwatch.elapsedTime();
 System.out.println(time);
 }
}