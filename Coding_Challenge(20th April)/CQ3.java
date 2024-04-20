import java.util.*;
 class CQ3 { 
    public static void main(String[] args){ 
        ArrayList<Integer> list = new ArrayList<Integer>(4); 
        list.add(11); 
        list.add(22); 
        list.add(33); 
        list.add(44);
		list.add(55);		
       
        int element = list.get(3); 
        System.out.println(element); 
    } 
}