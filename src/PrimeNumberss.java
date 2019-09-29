import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberss {
    public static void main(String[] args) {
        System.out.println(primeNumbers());
    }
    public static ArrayList<Integer>primeNumbers(){
        ArrayList<Integer>primeList=new ArrayList<>();
        Scanner scn =new Scanner (System.in);
        System.out.println("Please enter maximum number : ");
        int max =scn.nextInt();
        int i=0;

        for (i=1;i<=max;i++){
            int counter=0;
            for (int num =i;num>=1;num--){
                if (i%num==0){
                    counter++;
                }
            }
            if (counter==2){
                primeList.add(i);
            }
        }
        return primeList;


    }

}
