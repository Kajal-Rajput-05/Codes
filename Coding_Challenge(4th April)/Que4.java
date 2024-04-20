import java.util.*;
public class Que4 {

    static ArrayList<String>letter(int[] num, int n, String[] table){
        ArrayList<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("");
 
        while (!q.isEmpty()) {
            String s = q.remove();
 
            if (s.length() == n)
                list.add(s);
            else {
                String val = table[num[s.length()]];
                for (int i = 0; i < val.length(); i++) {
                    q.add(s + val.charAt(i));
                }
            }
        }
        return list;
    }
 
    static void letter (int[] num, int n){
        String[] table = { "0",   "1",   "abc",  "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        ArrayList<String> list = letter (num, n, table);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    public static void main(String args[]){
        int[] num = { 2, 5 };
        int n = num.length;
        letter (num, n);
    }
}