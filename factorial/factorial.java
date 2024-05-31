
public class factorial{
    public static void main(String args[]){
        int fin = 1;
        int n = 5;
        if(n == 0){
            System.out.println(fin);
        } else if(n < 0){
            System.out.println("Positive Numbers only");
        }
        else {
            for(int i = 1; i <= n; i++){
                fin *= i;
            }
            System.out.println(fin);
        }
    }
}