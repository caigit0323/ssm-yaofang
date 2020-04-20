import java.util.Scanner;

public class C2_2 {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");

        
        year = sc.nextInt();
        isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        
        sc.close();
    }
}