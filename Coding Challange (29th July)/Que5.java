import java.util.Scanner;

public class Que5 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num 2 : ");
        int num2 = sc.nextInt();

        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;

        System.out.println("Swapped Num 1 :"+num1+" Swapped Num 2 : "+num2);

    }

}