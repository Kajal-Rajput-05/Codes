import java.util.Scanner;

public class Que25 {
    static boolean isPerfect(int n){
        if (n == 1)
            return false;
        int sum = 1;
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n)
            return true;

        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = sc.nextInt();
        if (isPerfect(num))
            System.out.println(num + " is a perfect number");
        else
            System.out.println( num + " is not a perfect number");
    }
}