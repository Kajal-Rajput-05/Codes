import java.util.Scanner;

public class Que11 {

    static void factnum(int num){
        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                System.out.print(i + " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = sc.nextInt();

        factnum(num);
        
    }
}