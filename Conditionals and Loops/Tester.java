/** public class Tester {

    public static int g (int n) {
        if (n % 2 == 0) return n/10;
        return  g(g(n/10));
    }
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        g(num);
        System.out.println(g(num));
    }
}
**/
 
public class Tester {

    public static void mystery(int x, int []y, int[]z) {
        x = x + 1;
        y[0] = y[0] + 1;
        z = y;
    }
    public static void main(String[] args){
        int xx = 1;
        int []yy = {2, 3, 4, 5};
        int []zz = {6, 7, 8, 9};
        mystery(xx, yy, zz);
        System.out.println(xx);
        System.out.println(yy[0]);
        System.out.println(zz[0]);
        yy = zz;
        mystery(xx, yy, zz);
        System.out.println(xx);
        System.out.println(yy[0]);
        System.out.println(zz[0]);
       
        /** This will print out 
        * 2
        3
        3
        
        3
        7
        7 **/
    }
}


