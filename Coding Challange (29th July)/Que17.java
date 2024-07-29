import java.util.Scanner;

public class Que17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num 2 : ");
        int num2 = sc.nextInt();

        int ans = (num1 > num2) ? num1 : num2;
        while (true) {
            if (ans % num1 == 0 && ans % num2 == 0)
                break;
            ans++;
        }
        System.out.println("LCM of " + num1 + " and " + num2 + " : " + ans);
    }
} 