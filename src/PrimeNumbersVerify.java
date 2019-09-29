import java.util.Scanner;

public class PrimeNumbersVerify {
    public static void main(String[]args){
        boolean check=false;
        System.out.println("Type any number to cehck if it is prime or not:  " );

        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();

        for (int i =2;i<number;i++){
            if (number%i==0){
                check=false;
                break;
            }
            else{
                check =true;
            }
            if (check==true){
                System.out.println(number+ "is a prime number.");

            }
            else{
                System.out.println(number+ " is not a prime number.");
            }
        }

    }
}
