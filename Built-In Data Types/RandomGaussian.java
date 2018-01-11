public class RandomGaussian {
    
    public static void main(String[] args){
        double v = Math.random() * 1;
        double u = Math.random() * 1;
        double r = (Math.sin(2 * Math.PI * v))* Math.pow((-2 * Math.log(u)), 0.5); 
        System.out.println(r);
    }
}
