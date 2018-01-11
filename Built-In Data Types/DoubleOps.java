public class DoubleOps
{
   public static void main(String[] args)
   {
      double a = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]);
      double p = a * b;
      double q = a / b;
      double r = a % b;
      System.out.println(a + " * " + b + " = " + p);
      System.out.println(a + " / " + b + " = " + q);
      System.out.println(a + " % " + b + " = " + r);
      System.out.println(a + " = " + q + " * " + b + " + " + r);
   }
}
