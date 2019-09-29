import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0, num = 0;
        String primeNumber = "";
        System.out.println("Enter an upper limit: ");
        int n = scan.nextInt();

        for (i = 1; i <= n; i++) {
        int counter = 0;
        for (num = i; num >= 1; num--) {
            if (i % num == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            primeNumber = primeNumber + i + " ";
        }

    }
    System.out.println("Prime number between 1 and 100: ");
        System.out.println(primeNumber);

    }

}
