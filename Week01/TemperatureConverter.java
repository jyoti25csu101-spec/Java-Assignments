import java.util.Scanner;
public class TemperatureConverter {
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.println("enter celsius ");
double celsius=sc.nextDouble();
double  fahrenheit = celsius * 9.0 / 5.0 + 32.0;
System.out.println("fahrenheit value is "+fahrenheit);
sc.close();

    }
}
