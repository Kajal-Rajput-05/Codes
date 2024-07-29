import java.util.Scanner;

public class Que21 {
    static boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
 
        return true;
    }
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = sc.nextInt();

        if (isPrime(num))
            System.out.println(" true");
        else
            System.out.println(" false");
    }
}