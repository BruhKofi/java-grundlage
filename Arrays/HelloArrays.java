public class HelloArrays {
    public static void main(String[] args){
        double[] a = new double[5];
        for (int i = 0; i < 5; i++){
        a[i] = Math.round(Math.random());
        System.out.println(a[i]);
        }
    }
}
