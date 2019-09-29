import java.util.Scanner;

public class Factorial_ternary {
    static int factorial (int n){
        return (n==0 || n==1)?1:n*factorial(n-1);//ternary operator

    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type any whole number to find its factorial: ");
        int num=input.nextInt();
        System.out.println("result: "+factorial(num));
    }
}
