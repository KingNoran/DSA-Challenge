
public class binarySearch {
    public static int[] arr = {-5,2,4,6,10};
    public static void main(String args[]){
        System.out.println(binSearch(arr, 10));
    }

    public static int binSearch(int[] n, int t){
        int leftIndex = 0;
        int rightIndex = n.length - 1;

        while(leftIndex <= rightIndex){
            int middleIndex;

            if(n.length % 2 != 0){
                middleIndex = (int) Math.floor((leftIndex + rightIndex) / 2);
            } else {
                middleIndex = n.length / 2;
            }

            if(t == n[middleIndex]){
                return middleIndex;
            }
            if(t < n[middleIndex]){
                rightIndex = middleIndex - 1;
            } else {
                leftIndex = middleIndex + 1;
            }
        }
        return -1;
    }
    
}
