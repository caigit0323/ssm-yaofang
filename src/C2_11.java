import java.util.Scanner;

public class C2_11 {
    public static void main(String[] args) {
        int n;
        GameResult result;
        GameResult omit = GameResult.CANCEL;
       
        for (GameResult count: GameResult.values()) {
            result = count;
            if (result == omit) 
                System.out.println( "The game was cancelled");
            else {
                System.out.print("The game was played ");
                if (result == GameResult.WIN)
                    System.out.println("and we won!");
                if (result == GameResult.LOSE)
                    System.out.println("and we lost.");
            }
        }
    }
}