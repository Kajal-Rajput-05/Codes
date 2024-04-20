class CQ9{
		Node head;
		
		static class Node{
			int data;
			Node link;
		
			Node(int d){
				data = d;
				link = null;
		}
	}
		public void insertAfter(Node prev_node, int new_data ){
			Node new_node = new Node(new_data);
			new_node.link = prev_node.link;
			prev_node.link = new_node;			
		}
		
	    public void display(){
		Node n = head;
		while( n != null ){
		    System.out.print(n.data + " -> "); 
            n = n.link; 
		}			
	}
	
	public static void main(String args[]){
		
		CQ9 l1 = new CQ9();
		l1.head = new Node(11);	//head connected to first node
		Node second = new Node(22);	// node created 
		Node third = new Node(33);	// node created
		
		l1.head.link = second;	//link connection
		second.link = third;	// link connection
		
		
		l1.insertAfter( l1.head.link,44 );
		l1.display();
	}
}