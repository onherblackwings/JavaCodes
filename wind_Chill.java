public class wind_Chill
{
 public static void main(String[] args)
 {
  Stopwatch stopwatch = new Stopwatch();   
  double temp=3;
  double wiND_SPeed=4;
  
  double w1=(35.74+(0.6215*temp));
  double w2=((0.4275*temp)-35.75)*Math.pow(wiND_SPeed,0.16);
  double w=w1+w2;
  System.out.println(w);
  double time = stopwatch.elapsedTime();
 System.out.println(time);
  
 }
}