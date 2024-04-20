  
import java.util.*; 
class CQ11 { 
    public static void main(String[] args) { 
        LinkedList<String> list = new LinkedList<String>(); 
		
		list.add("047_");
        list.add("Kajal"); 
        list.add("Rajput"); 
        list.add("_KH"); 
  
        System.out.println("LinkedList Elements : "); 
  
        for (int i = 0; i < list.size(); i++) { 
            System.out.println("Index " + i + " : " + list.get(i)); 
        } 
    } 
}