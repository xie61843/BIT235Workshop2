public class Exercise1_4 {
    public static void main(String[] args) {
        double P = 5000.00;  // principal
        double r = 0.04;     // annual interest rate 4%
        int n = 10;          // number of years

        double A = P * Math.pow((1 + r), n);
        System.out.println("Total amount after 10 years = $" + A);
    }
}
