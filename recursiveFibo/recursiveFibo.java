public class recursiveFibo {
    public static void main(String args[]){
        System.out.println(recursiveFibonacci(5));
    }

    public static int recursiveFibonacci(int n){
        if (n < 2){
            return n;
        } else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }
}