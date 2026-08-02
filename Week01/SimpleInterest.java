import java.util.Scanner;
public class SimpleInterest {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal value: ");
        double principal = sc.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time: ");
        double time = sc.nextDouble();

        double simpleInterest= (principal*rate*time)/100.0;
        double finalAmount = principal + simpleInterest;

         System.out.println("Simple Interest is: "+simpleInterest);
         System.out.println("final amount is: "+finalAmount);
         sc.close();

}
}
