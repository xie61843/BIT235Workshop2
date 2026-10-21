import java.util.Scanner;

public class Exercise1_3 {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        double area = PI * Math.pow(r, 2);
        System.out.println("Area of the circle = " + area);

        sc.close();
    }
}
