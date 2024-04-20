
class LQ23 {
    public static void main(String[] args){
        int n = 7;
        for (int i = 1; i <= n; i++)  {
            int startValue = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= n; j++){
                System.out.print(startValue);
                startValue = 1 - startValue;
            }
            System.out.println();
        }
    }
}