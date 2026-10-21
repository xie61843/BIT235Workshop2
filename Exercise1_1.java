import java.util.Scanner;

public class Exercise1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        int diff = num1 - num2;
        System.out.println("The difference is: " + diff);

        sc.close();
    }
}
