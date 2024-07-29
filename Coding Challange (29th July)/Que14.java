import java.util.Scanner;

public class Que14 {
    static int add(int num1, int num2){
        for (int i = 1; i <= num2; i++)
            num1++;
        return num1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num 2 : ");
        int num2 = sc.nextInt();

        int num = add(num1, num2);
        System.out.print(num);
    }
}