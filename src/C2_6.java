import java.util.Scanner;

public class C2_6 {
    public static void main(String[] args) {
        int n, right_digit;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        n = sc.nextInt();

        System.out.print("The number in reverse order is ");
        do {
            right_digit = n % 10;
            System.out.print(right_digit);
            n /= 10;
        } while (n != 0);

        System.out.println();
        sc.close();
    }
}