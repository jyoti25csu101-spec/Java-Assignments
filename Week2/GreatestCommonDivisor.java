import java.util.Scanner;
public class GreatestCommonDivisor {
    public static int gcd(int first,int second){
        while(second!=0){
            int remainder =first %second;
            first=second;
            second=remainder;

        }
        return first;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number");
        int first= sc.nextInt();
        System.out.println("enter second number");
        int second= sc.nextInt();

        int originalFirst = first;
        int originalSecond = second;

        first = Math.abs(first);
        second = Math.abs(second);
        int result=gcd(first,second);
        System.out.println("GCD of " + originalFirst + " and " + originalSecond + " is " + result);
        
        sc.close();

    }
}
