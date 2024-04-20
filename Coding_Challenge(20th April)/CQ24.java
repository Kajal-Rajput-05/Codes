
import java.util.*;
class CQ24{
  public static void main(String[] args) {
	  Map<Integer, String> list = new HashMap<Integer, String>();
	  
	  list.put(11,"Red");
	  list.put(22, "Orange");
	  list.put(33, "Yellow");
	  list.put(44, "Green");
	  list.put(55, "Blue");
	  list.put(66, "Indigo");
	  list.put(77, "Violet");
	  
	   System.out.println("Key : " + list.containsKey(11));
	   System.out.println("Key : " + list.containsKey(88));
	 }
}