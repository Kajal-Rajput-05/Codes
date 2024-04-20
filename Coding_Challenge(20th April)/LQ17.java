
public class LQ17 {
    public static void main(String args[]){
        int n = 5;
        print(n);
    }
    public static void print(int n){
        int i, j;
        int num = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = n-1; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
 
            System.out.println();
        }
    }
}