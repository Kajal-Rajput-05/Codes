import java.util.Scanner;

public class Que8 {
    public static void main(String[] args){
        Scanner Year = new Scanner(System.in); 
        System.out.print("Enter a Year : ");
        int year = Year.nextInt();
            
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println(year + " Leap Year");
        }
        else {
            System.out.println(year + " Not Leap Year");
        }
    }
}
