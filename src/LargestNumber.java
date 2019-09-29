public class LargestNumber {
    public static void main(String []args){
        int[]array={28,13,20,43,54,12,12};
        int value=array[0];

        for (int i=0;i<array.length;i++){
            if (array[i]>value){
                value=array[i];

            }
        }
        System.out.println("Largest number in an array is "+value);
    }
}
