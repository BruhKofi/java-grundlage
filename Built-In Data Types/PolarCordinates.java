public class PolarCordinates{
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        //should figure out how to compute θ later
        double r = Math.atan2(y, x); 
        System.out.print(r);
    }
}
