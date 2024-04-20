
 class LQ1 {
    public static void main(String[] args) {
        int n = 5;
        int spaces = n - 1;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            if (i == 1 || i == n){
                for (int j = 1; j <= stars; j++){
                    System.out.print("*");
                }
            }
             else {
                System.out.print("*");
                for (int j = 1; j <= stars - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }
    }
}