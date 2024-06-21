import java.util.Arrays;

public class bubbleSort {
    public static int sampleArr[] = {-6, 20, 8, -2, 4};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbySort(sampleArr)));
    }

    public static int[] bubbySort(int arr[]){
        while(true){
            boolean didSwap = false;
            for (int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    int placeholder = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = placeholder;
                    didSwap = true;
                }
            }
            if(!didSwap){
                return arr;
            }
        }
    }
}
