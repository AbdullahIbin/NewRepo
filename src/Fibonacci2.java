public class Fibonacci2 {
    static int fibonacci(int n){
        if (n<=1){
            return n;

        }
        return fibonacci(n-1)+fibonacci(n-2);

    }

    public static void main(String[] args) {
        for(int i=0;i<=15;i++){
            System.out.println(fibonacci(i));

        }
    }

}
