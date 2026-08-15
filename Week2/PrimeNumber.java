import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int[] testCases = {-5, 0, 1, 2, 3, 4, 17, 25, 97};
        
        System.out.println("--- Running Required Test Cases ---");
        for (int test : testCases) {
            displayPrimeStatus(test);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to test: ");
        
        if (sc.hasNextInt()) {
            int userNumber = sc.nextInt();
            displayPrimeStatus(userNumber);
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }
        
        sc.close();
    }

    public static void displayPrimeStatus(int number) {
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false; 
            }
        }

        return true; 
    }
}
