import java.util.Scanner;

public class Que15 { 
    static int reverse(int n) { 
        int rev = 0; 
        int rem; 
        while (n > 0) { 
            rem = n % 10; 
            rev = (rev * 10) + rem; 
            n = n / 10; 
        } 
        return rev; 
    } 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = sc.nextInt();

        System.out.print("Reverse "+ reverse(num)); 
    } 
}