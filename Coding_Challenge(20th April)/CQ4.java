
import java.util.*;
class CQ4 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();

        list.add("44");
        list.add("22");
        list.add("99");
        list.add("77");
        list.add("33");

        Collections.sort(list);
        System.out.println(list);
    }
}