public class SortingArrayElements {
    public static void main (String[]args){
        int[] array={28,23,12,43,56,67};
        int temp=0;
        for (int i=0;i<=array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]<array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }
        System.out.println("Descending order: ");

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
