
import java.util.*; 
  
class CQ17 { 
    public static void main(String[] args) { 
        HashSet<String> set = new HashSet<String>(); 
        set.add("047"); 
        set.add("Kajal"); 
        set.add("Rajput"); 
        set.add("KH"); 
  
        String arr[] = new String[set.size()]; 
        int i=0; 
        for(String element:set){ 
          arr[i++] = element; 
        } 
        for (String n : arr) 
            System.out.println(n); 
    } 
}