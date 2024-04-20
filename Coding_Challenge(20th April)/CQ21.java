
import java.util.*;
 class CQ21{ 
    public static void main(String[] args){  
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
  
        arr.add(11); 
        arr.add(22); 
        arr.add(33); 
   
		System.out.println(arr);
		
        arr.remove(11); 
		arr.remove(22);
		arr.remove(33);
        System.out.println(arr); 
    } 
}