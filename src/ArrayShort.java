import java.util.ArrayList;

public class ArrayShort {
    public static void main(String[] args) {
        int[] myArr = {3, 34, 32, 67, 54, 35};
        arraySort(myArr);

    }

    public static void arraySort(int[] arr) {
        ArrayList<Integer> myArr = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max && !myArr.contains(arr[i])) {
                    max = arr[i];

                }
            }
            myArr.add(max);
        }
        System.out.println(myArr);
    }
}
