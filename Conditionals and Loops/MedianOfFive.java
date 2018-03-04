/**
 * MedianOfFive
 */
public class MedianOfFive {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);

        int[] list = new int[0];
        for (int i = 0; i <= 5; i++){
            list[0] = a;
            list[1] = b;
            list[2] = c;
            list[3] = d;
            list[4] = e;
        }
        

        System.out.println(list);

    }
}
