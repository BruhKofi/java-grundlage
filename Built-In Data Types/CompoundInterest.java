public class CompoundInterest {
    public static void main(String[] args) {
        double initialCapital = Double.parseDouble(args[0]);
        double numberOfYears = Double.parseDouble(args[1]);
        double interestPA = Double.parseDouble(args[2]);

        double productOfInterestnTime = numberOfYears * interestPA;
        double compoundedInterest = Math.pow(initialCapital, productOfInterestnTime);

        System.out.println(compoundedInterest);

    }
}
