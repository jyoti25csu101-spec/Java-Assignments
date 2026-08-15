import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check:");
        int year = sc.nextInt();
        boolean lp = isLeapYear(year);
        System.out.println(year+" is a leap year -> "+lp);
        
        sc.close(); 
    } 
//divisible by 4 is insufficient for century years 
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }
} 

