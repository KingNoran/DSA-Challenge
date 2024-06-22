import java.util.Arrays;

public class insertionSort {
    public static int sampleArr[] = {-6, 20, 8, -2, 4};
    public static void main(String[] args) {
        insertSort(sampleArr);
        System.out.println(Arrays.toString(sampleArr));
    }   
    
    public static void insertSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            boolean didSwap = true;
            int sor = i - 1;
            int nti = i;

            while(didSwap){
                if(arr[nti] < arr[sor]){
                    int placeholder = arr[nti];
                    arr[nti] = arr[sor];
                    arr[sor] = placeholder;
                    sor--;
                    nti--;
                } else {
                    didSwap = false;
                }
            }
        }
    }
}
