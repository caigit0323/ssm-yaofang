import java.util.Scanner;

public class C2_10{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0, n;
        System.out.println("Enter some integers please (enter 0 to quit):");
        n = sc.nextInt();
        while (n != 0) {
            if (n > 0)
                i += 1;
            if (n < 0)
                j += 1;
            n = sc.nextInt();
        }
        System.out.println("Count of positive integers: " + i);
        System.out.println("Count of negative integers: " + j);
        sc.close();
    }
}