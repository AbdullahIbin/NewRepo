public class fibonaccaiArray {
    public static void main(String[] args) {
        int fib[]=new int [12];
        fib[0]=1;
        fib[1]=1;
        for (int i =0;i<10;i++){
            fib[i+2]=fib[i+1]+fib[i];

        }
        for (int i=2;i<12;i++){
            fib[i]=fib[i-1]+fib[i-2];
            System.out.println(fib [i]);
        }
        for (int i=0;i<12;i++){
            System.out.print(fib [i]);
        }


    }
}
