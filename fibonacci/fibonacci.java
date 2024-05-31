public class fibonacci{
    public static void main(String args[]){
        int n = 10;
        int fibonacci[] = new int[n];
        for(int i = 0; i < fibonacci.length; i++){
            if (i > 1){
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            } else {
                fibonacci[i] = i;
            }      
        }
        for(int i = 0; i < fibonacci.length; i++){
            System.out.println(fibonacci[i]);
        }
    }
}