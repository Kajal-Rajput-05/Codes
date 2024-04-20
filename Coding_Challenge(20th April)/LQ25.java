
class LQ25 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            int val = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(val + " ");
                val++;
                if (val > n) {
                    val = 1;
                }
            }
            System.out.println();
        }
    }
}