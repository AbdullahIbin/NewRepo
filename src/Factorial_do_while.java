import java.util.Scanner;

public class Factorial_do_while {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Type ant whole number to find its factorial: ");
        int num=input.nextInt();
        int i=1,result=1;
        do {
            result *= i;  //same as (result=result*i)
            i++;
        }
        while(i <=num);
        System.out.println("Result "+ result);
    }
}
