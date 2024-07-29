import java.util.Scanner;
public class Que3 {
    static int fact(int num){
        if(num <=1)
            return 1;
        else
            //return num*fact(num-1);// tail recursion
			return fact(num-1)*num ;// head recursion
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = sc.nextInt();
            System.out.println( fact(num) );
    }
}