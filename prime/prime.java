

public class prime{
    public static int n = 13;
    // Old Method
    /* for(int i = 1; i < n; i++){
        for(int j = i; j < n; j++){
            if(i * j == n){
                System.out.println("False");
                System.exit(0);
            }
        }
    }
    System.out.println("True"); */
    public static void main(String args[]){
        isPrime();
    }

    // New Method

    public static void isPrime(){
        for(int i = 2; i < n; i++){
            if (n % i == 0){
                System.out.println("False");
                System.exit(0);
            }
        }
        System.out.println("True");
    }
}