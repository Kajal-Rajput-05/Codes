
import java.util.*;
 class CQ7{ 
    public static void main(String[] args){  
        ArrayList<Integer> arr = new ArrayList<Integer>(4); 
  
        arr.add(11); 
        arr.add(22); 
        arr.add(33); 
        arr.add(44); 
  
        System.out.println(arr); 
  
        int element = arr.get(2); 
        System.out.println("Num at index 2 is : "+ element); 
    } 
}