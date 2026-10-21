import java.util.Scanner;

public class Exercise1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();

        boolean strEqual = s1.equals(s2);
        System.out.println("the two given strings are equal " + strEqual);

        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        boolean firstCharEqual = (c1 == c2);
        System.out.println("Are the first characters equal? " + firstCharEqual);

        sc.close();
    }
}
