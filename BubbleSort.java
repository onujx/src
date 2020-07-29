import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {55, 7, 78, 12, 42};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j= 1; j < arr.length; j++) {
                if (arr[j] < arr[j-1] ) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
