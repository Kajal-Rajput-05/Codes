
import java.util.*;
 class CQ14{ 
    public static void main(String[] args){  
        ArrayList<Integer> arr = new ArrayList<Integer>(4); 
  
        arr.add(11); 
        arr.add(22); 
        arr.add(33); 
        arr.add(44); 
		System.out.println(arr);
		
        arr.set(0,99); 
		arr.set(1,88);
		arr.set(2,77);
		arr.set(3,66);
        System.out.println(arr); 
    } 
}