
import java.util.*; 
class CQ23 { 
    public static void main(String args[]) { 
        PriorityQueue<String> queue = new PriorityQueue<String>(); 
        queue.add("047"); 
        queue.add("Kajal"); 
        queue.add("Rajput"); 
        queue.add("KH"); 
		
        Object[] arr = queue.toArray(); 
        for (int j = 0; j < arr.length; j++) 
            System.out.println(arr[j]); 
    } 
}