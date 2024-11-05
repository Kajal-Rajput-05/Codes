public class SinglyLinkedList{
	Node head;
	Node tail;
	float total;
	
	static class Node{
		int srNo;
		int cuSrNo;
		float price;
		String str;
		String cusName;
		String addStr;
		String phoneNo;
		Node next;
		
		Node(int srNo,String str,float price){
			this.srNo=srNo;
			this.str=str;
			this.price=price;
			this.next=null;
		}
		
		Node(int cuSrNo,String cusName,String addStr,String phoneNo){
			this.srNo=cuSrNo;
			this.cusName=cusName;
			this.addStr=addStr;
			this.phoneNo=phoneNo;
			this.next=null;
		}
	}
	
	void addNode(int srNo,String str,float price){
		Node newNode=new Node(srNo,str,price);
		if(head==null){
			head=newNode;
			tail=newNode;
		}else{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	void addNode(int cuSrNo,String cusName,String addStr,String phoneNo){
		Node newNode=new Node(cuSrNo,cusName,addStr,phoneNo);
		if(head==null){
			head=newNode;
			tail=newNode;
		}else{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	void deleteNode(int key){
		Node current = head, prev = null;
		if(current != null && current.srNo == key){
			head=current.next;
		return;
		}
		while(current!=null && current.srNo!=key){
			prev=current;
			current=current.next;
		}
		if(current==null)
			return;
		prev.next=current.next;
	}
	
	void display(){
		System.out.println("Display models of Tv");
		Node current=head;
		if(current==null){
			System.out.println("List is empty");
			return;
		}
		System.out.println("Sr.No.\t  Model No.\t    MRP");
		System.out.println("=====================================");
		while(current!=null){
			System.out.println("  "+current.srNo+"\t   "+current.str+"\t Rs."+current.price+"/-");
			current=current.next;
		}
		System.out.println("=====================================");
		System.out.println();
	}
	
	void displayCustomer(){
		System.out.println("Display Customer details : ");
		Node current=head;
		if(current==null){
			System.out.println("List is empty");
			return;
		}
		System.out.println("Sr.No.\t Customer Name  \tDelivery Add.\t    Phone No.");
		System.out.println("===============================================================");
		while(current!=null){
			System.out.println("  "+current.srNo+"\t   "+current.cusName+"\t\t "+current.addStr+" "+current.phoneNo);
			current=current.next;
		}
	}
	
	void calculateBill(){
		Node current=head;
		if(current==null){
			System.out.println("List is empty");
			return;
		}
		System.out.println("Sr.No.\t  Model No.\t    MRP");
		System.out.println("=====================================");
		float total=0;
		while(current!=null){
			System.out.println("  "+current.srNo+"\t   "+current.str+"\t Rs."+current.price+"/-");
			total=total+current.price;
			current=current.next;
		}
		System.out.println("=====================================");
		System.out.println("Total : \t\tRs."+total+"/-");
		System.out.println();
	}
	
}

