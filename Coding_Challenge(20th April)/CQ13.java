
class CQ13{
    Node head;  
	
	class Node{
		int data;
		Node next;
		Node(int d){  
			data = d;  
			next = null; 
		}
	}
    boolean compare(CQ13 listb){
        Node a = this.head, b = listb.head;
        while (a != null && b != null)
        {
            if (a.data != b.data)
                return false;
            a = a.next;
            b = b.next;
        }
        return (a == null && b == null);
    }
	public void insert(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 public static void main(String[] args){
        CQ13 list1 = new CQ13();
		CQ13 list2 = new CQ13();
		
        list1.insert(11);
        list1.insert(22);
        list1.insert(33);
        list1.insert(44);
        list1.insert(55);
		
        list2.insert(11);
        list2.insert(22);
        list2.insert(33);
        list2.insert(44);
        list2.insert(55);
 
		if (list1.compare(list2) == true)
            System.out.println("Same ");
        else
            System.out.println("Different ");
    }
}
*/
//-----------------------------------
/*
   boolean compare(CQ13 list2){
        Node list1 = this.head;
		Node list2 = this.head;
        while (list1 != null && list2 != null)
        {
            if (list1.data != list2.data)
                return false;

            list1 = list1.next;
            list2 = list2.next;
        }
 
        return (list1 == null && list2 == null);
    }
*/