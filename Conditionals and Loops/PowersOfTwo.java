public class PowersOfTwo
{
   public static void main(String[] args)
   {  // Print the first n powers of 2.
      int n = Integer.parseInt(args[0]);
      int power = 1;
      int i = 0;
      //a number 31 or above will be ablove the scope of int so escape that with this an error statement in that case
      if (n >= 31) System.out.println("Number too high"); else 
      while (i <= n)
      {  // Print ith power of 2.
         System.out.println(i + " " + power);
         power = 2 * power;
         i = i + 1;
      }
   }
}
