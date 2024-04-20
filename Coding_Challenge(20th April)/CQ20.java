
import java.util.*; 
class CQ20 { 
    public static void main(String args[]) { 
        TreeSet<Integer> tree = new TreeSet<Integer>(); 

        tree.add(5); 
        tree.add(13); 
        tree.add(15); 
        tree.add(7); 
        tree.add(9); 
        tree.add(11); 
  
        System.out.println(tree.lower(7)); 
    } 
}