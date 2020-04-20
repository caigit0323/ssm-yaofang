
public class C2_9 {
    public static void main(String[] args) {
        final int N = 4;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 30; j++)
                System.out.print(' ');
            for (int j = 1; j <= 8 - 2 * i; j++)
                System.out.print(' ');
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print('*');
            System.out.println(' ');
        }
        for (int i = 1; i <= N - 1; i++) {
            for (int j = 1; j <= 30; j++)
                System.out.print(' ');
            for (int j = 1; j <= 7 - 2 * i; j++)
                System.out.print('*');
            System.out.println(' ');
        }
    }
}