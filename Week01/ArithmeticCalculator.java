import java.util.Scanner;

class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a:");
        int a = sc.nextInt();
        
        System.out.println("which arithmetic operation want to perform +,-,*,%,/");
        char c = sc.next().charAt(0); 
        
        System.out.println("enter b:");
        int b = sc.nextInt();
        
        double result;
        
        switch(c) {
            case '+':
                result = a + b;
                System.out.println("a+b =" + result);
                break;
            case '-':
                result = a - b;
                System.out.println("a-b =" + result);
                break;
            case '*':
                result = a * b;
                System.out.println("a*b =" + result);
                break;
            case '%':
                result = a % b;
                System.out.println("a%b =" + result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("division by zero is not allowed");
                } else {
                    result = (double) a / b;
                    System.out.println("a/b =" + result);
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        sc.close();
    }
}
