
import java.util.*;
class CQ6 {
    public static void main(String args[]){
        ArrayList<String> ArrList = new ArrayList<String>();
        ArrList.add("11");
        ArrList.add("22");
        ArrList.add("33");
        ArrList.add("44");
        ArrList.add("55");
		
        System.out.println(ArrList);
        Collections.swap(ArrList, 1, 2);
        System.out.println(ArrList);
    }
}
