import java.util.Scanner;

public class Que22 {
    static void primeNumber(int num){
        int x, y, flg;

        System.out.println("Prime numbers within 1 and " + num + " : ");
        for (x = 1; x <= num; x++) {
            if (x == 1 || x == 0)
                continue;
            flg = 1;

            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                System.out.print(x + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = sc.nextInt();
        primeNumber(num);
    }
} 