import java.util.Scanner;

public class C2_8 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        n = sc.nextInt();

        System.out.print("Number  " + n + "   Factors  ");

        for (int k = 1; k <= n; k++)
            if (n % k == 0)
                System.out.print(k + "  ");
        System.out.println();
        
        sc.close();
    }
}