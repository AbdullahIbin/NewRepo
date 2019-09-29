import java.util.Scanner;

public class Factorial_1 {
    static int factorial(int n){
        int result=1;
        for (int i=2;i<=n;i++){
            result=result *i;
        }
        return result;
    }
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Type amy integer to calculate its factorial: ");
        int number=input.nextInt();
        System.out.println("Factorial of number "+number +" is "+ factorial(number));
    }
}
