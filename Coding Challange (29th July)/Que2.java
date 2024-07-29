import java.util.Scanner;

public class Que2 {
    static int fact(int num) {
        int result = 1,i;
        for(i=2; i<=num; i++)
            result *= i;
        return result;
    }
    public static void main(final String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " is "+ fact(num)); 
    
    }
}