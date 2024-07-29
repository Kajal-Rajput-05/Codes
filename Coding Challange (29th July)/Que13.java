import java.util.Scanner;

public class Que13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter Num 2 : ");
        int b = sc.nextInt();
        System.out.print("Enter Num 3 : ");
        int c = sc.nextInt();

        if(a<b && a<c){
            System.out.println(a +" is smallest number");
        }
        else if(b<c){
            System.out.println(b +" is smallest number");
        }
        else{
            System.out.println( c +" is smallest number");
        }
        
    }
}