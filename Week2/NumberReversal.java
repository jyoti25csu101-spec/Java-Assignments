import java.util.Scanner;
public class NumberReversal {
    public static int ReverseNumber(int number){
        int reverse= 0;
        while(number!=0){
        int digit =number%10;
        reverse = reverse*10+ digit;
        number=number/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter number which you want to reverse");
        int number=sc.nextInt();
        int result=ReverseNumber(number);
        System.out.println("reversed number: "+result);
        sc.close();

    }
}
