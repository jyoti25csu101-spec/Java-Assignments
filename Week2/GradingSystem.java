import java.util.Scanner;
 class GradingSystem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            System.out.println("enter marks");
            int mark=sc.nextInt();
            String result=classifyMark(mark);
            System.out.println(result);
    }
     public static String classifyMark(int mark){         
        if(mark<0||mark>100){
            return "invalid marks";
        }
        else if(mark>=80){
            return "Distinction";
        }
        else if(mark>=70){
            return "Merit";
        }
        else if(mark>=50){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }
}

