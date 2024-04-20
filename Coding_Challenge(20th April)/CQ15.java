
import java.util.*; 
class CQ15 { 
    public static void main(String[] args) { 
        HashSet<Integer> set = new HashSet<>(); 
        set.add(10); 
        set.add(20); 
        set.add(10); 
        set.add(50); 
        set.add(50); 
        Iterator<Integer> it = set.iterator(); 
        while (it.hasNext()) { 
            System.out.print(it.next() + " "); 
        } 
    } 
}