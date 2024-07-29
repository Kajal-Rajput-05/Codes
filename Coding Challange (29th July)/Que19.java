import java.util.Scanner;

public class Que19 {
    static boolean pali(String str, int s, int e){
     
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        if (s < e + 1)
            return pali(str, s + 1, e - 1);
			return true;
    }
    static boolean palindrome(int num){
        String str = String.valueOf(num);
        int n = str.length(); 
        return pali(str, 0, n - 1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = sc.nextInt();

        if (palindrome(num))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
} 