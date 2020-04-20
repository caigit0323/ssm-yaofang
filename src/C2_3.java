import java.util.Scanner;

public class C2_3 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y: ");

        x = sc.nextInt();
        y = sc.nextInt();
        
        if (x != y) {
            if (x > y) {
                System.out.println("x > y");
            } else {
                System.out.println("x < y");
            }
        } else {
            System.out.println("x = y");
        }

        sc.close();
    }
}