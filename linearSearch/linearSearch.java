public class linearSearch {
    public static int arr[] = {-5,2,10,4,6};
    public static void main(String args[]){
        System.out.println(lineSearch(arr, 10));
    }

    public static int lineSearch(int n[], int t){
        for(int i = 0; i < n.length; i++){
            if(n[i] == t){
                return i;
            }
        }
        return -1;
    }
}
