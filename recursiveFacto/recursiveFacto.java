public class recursiveFacto {
    public static void main(String args[]){
        System.out.println(recursiveFactorial(5));
    }

    public static int recursiveFactorial(int n){
        if (n == 0){
            return 1;
        } else {
            return recursiveFactorial(n - 1) * n;
        }
    }
}
