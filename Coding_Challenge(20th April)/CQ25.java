
import java.util.*;
class CQ25{
  public static void main(String[] args) {
	  Map<String, Integer> list = new HashMap<String, Integer>();
	  
	  list.put("Red",11);
	  list.put("Orange",22);
	  list.put("Yellow",33);
	  list.put("Green",44);
	  list.put("Blue",55);
	  list.put("Indigo",66);
	  list.put("Violet",77);
	  
	   System.out.println("Value : " + list.get("Red"));
	   System.out.println("Value : " + list.get("Orange"));
	   System.out.println("Value : " + list.get("Yellow"));
	   System.out.println("Value : " + list.get("Green"));
	   System.out.println("Value : " + list.get("Blue"));
	   System.out.println("Value : " + list.get("Indigo"));
	   System.out.println("Value : " + list.get("Violet"));
	 }
}