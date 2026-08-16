import java.util.Scanner;
public class NumberAnalyser {
        static int readNumber(Scanner input){
            return input.nextInt();
        }
        static boolean isEven(int number){
             return number % 2 == 0; 

        }
        static boolean isPositive(int number){
           return number>0;
        }
        static int absoluteValue(int number){
            if(number<0){
                number= -number;
            }
            return number;
        }
        static int countDigits(int number){
            number=absoluteValue(number);
            int count =0;
            do{
                count++;
               number =number/10;
            }while(number>0);

            return count;
        }

        static int sumDigits(int number){
            number=absoluteValue(number);
            int sum=0;
            while(number>0){
              sum+=number%10;
              number=number/10;
            
        }
        return sum;
    }
        static void printReport(int number,boolean even,boolean positive,int digitCount,int digitSum){
        System.out.println("number report is ");
        System.out.println("input number is : "+number);
        System.out.println("number is even "+even);
        System.out.println("number is positive : "+positive);
        System.out.println("digit count of number is : "+digitCount);
        System.out.println("digit sum of number is : "+digitSum);


        }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int input= readNumber(sc);
    boolean Even= isEven(input);
    boolean positive= isPositive(input);
    int dc= countDigits(input);
    int sd= sumDigits(input);
    printReport(input,Even,positive,dc,sd);
    sc.close();

        }
}
