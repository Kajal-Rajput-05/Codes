
public class LQ15 {
    public static void main(String args[]){
        int n = 6;
        print(n);
    } 
    public static void print(int n){
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}