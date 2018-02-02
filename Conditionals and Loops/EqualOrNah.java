/**
 * EqualOrNah
 */
public class EqualOrNah {
    public static void main(String[] args) {
        int u = Integer.parseInt(args[0]);
        int v = Integer.parseInt(args[1]);
        int w = Integer.parseInt(args[2]);
        

        if ((u == v) && (v == w))
            System.out.println("equal");
        else
            System.out.println("not equal");
    }

}
