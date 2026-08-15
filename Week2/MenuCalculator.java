import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        int a;
        int b;

        do {
            printMenu(); 
            
            choice = readChoice(sc); 
            
            if (choice == '0') {
                System.out.println("Exiting program...");
                break; 
            }
    
            System.out.print("Enter first number (a): ");
            a = sc.nextInt();
            System.out.print("Enter second number (b): ");
            b = sc.nextInt();
            
            if (choice == '/' && b == 0) {
                System.out.println("Error: Division by zero is not allowed.\n");
                continue; 
            }
            
            double result = calculate(a, b, choice);
            System.out.println("The calculated result is: " + result + "\n");
            
        } while (choice != '0'); 
        
        sc.close(); 
    } 

    public static void printMenu() {
        System.out.println("--- MenuCalculator ---");
        System.out.println("Available operations: +, -, *, / (0 to exit)");
    }

    public static char readChoice(Scanner sc) {
        char input;
        while (true) {
            System.out.print("Enter your choice: ");
            input = sc.next().charAt(0);
            
            if (input == '+' || input == '-' || input == '*' || input == '/' || input == '0') {
                return input;
            }
            System.out.println("Invalid choice! Please choose +, -, *, /, or 0.");
        }
    }

    public static double calculate(int a, int b, char choice) {
        double result = 0; 

        switch (choice) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = (double) a / b; 
                break;
        }
        return result; 
    } 
}


