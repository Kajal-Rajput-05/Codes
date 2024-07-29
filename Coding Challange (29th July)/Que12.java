import java.util.Scanner;

public class Que12 {
    static int getSum(int n){    
        int sum = 0;
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
    return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = sc.nextInt();

        System.out.println(getSum(num));
    }    
}