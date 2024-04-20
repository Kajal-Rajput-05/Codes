import java.util.*; 
  
public class CQ18 { 
    public static void main(String[] argv) { 
        Set<String> arr1 = new HashSet<String>(); 

        arr1.add("047"); 
        arr1.add("Kajal"); 
        arr1.add("Rajput"); 
        arr1.add("KH"); 


        System.out.println("Arr1 : " + arr1); 
 
        Set<String> arr2 = new HashSet<String>(); 
        arr2.add("047"); 
        arr2.add("Kajal"); 
        arr2.add("Rajput"); 
        arr2.add("KH"); 

        System.out.println("Arr2 : " + arr2); 
        boolean value = arr1.equals(arr2);
        System.out.println(value); 
    } 
} 