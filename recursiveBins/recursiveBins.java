
public class recursiveBins {

    public static int arr[] = {-5,2,4,6,10};
    public static void main(String args[]){
        System.out.println(recursiveBin(arr, 10));
        System.out.println(recursiveBin(arr, 6));
        System.out.println(recursiveBin(arr, 20));
    }

    public static int recursiveBin(int n[], int t){
        return search(n, t, 0, n.length - 1);
    }

    public static int search(int n[], int t, int leftIndex, int rightIndex){
        if(leftIndex > rightIndex){
            return -1;
        }

        int middleIndex = (int) Math.floor((leftIndex + rightIndex) / 2);

        if(t == n[middleIndex]){
            return middleIndex;
        }

        if(t < n[middleIndex]){
            return search(n, t, leftIndex, middleIndex - 1);
        } else {
            return search(n, t, middleIndex + 1, rightIndex);
        }
    }
}
