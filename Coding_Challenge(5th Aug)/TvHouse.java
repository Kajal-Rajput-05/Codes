import java.util.Scanner;
class TvHouse{
	
	public static void main(String[] args){
		Display obj=new Display();
		System.out.println("========================================");
		System.out.println("\t***WELCOME to TvHouse***");
		System.out.println("========================================");
		obj.customerDetails();
		obj.displayHeading();
		obj.displayExit();
	}
}

class Display{
	void displayHeading(){
		Scanner scan=new Scanner(System.in);
		System.out.println("We have two brand of TV\'s... \nPress \'1\' for LG and \'2\' for SONY");
		try{
			int num=scan.nextInt();
			if(num==1){
				System.out.println("Welcome to LG");
				System.out.println("We offer TV\'s in two sizes ");
				System.out.println("Press \'1\' for 32\" and \'2\' for 45\"");
				
				try{
					int tvSize=scan.nextInt();
					if(tvSize==1){
						lg32();
					}else if(tvSize==2){
						lg45();
					}
				}catch(Exception aex){
					System.out.println("Wrong Input");
					System.out.println("Redirect to homepage");
					displayHeading();
				}
				
			}else if(num==2){
				System.out.println("Welcome to LG");
				System.out.println("We offer TV\'s in two sizes ");
				System.out.println("Press \'1\' for 32\" and \'2\' for 45\"");
				try{
					int tvSize=scan.nextInt();
					if(tvSize==1){
						sony32();
					}else if(tvSize==2){
						sony45();
					}
				}catch(Exception aex){
					System.out.println("Wrong Input");
					System.out.println("Redirect to homepage");
					displayHeading();
				}
			}else{
				System.out.println("Wrong Input");
				System.out.println("Redirect to homepage");
				displayHeading();
			}
		}catch(Exception e){
			System.out.println("Wrong Input");
			System.out.println("Redirect to homepage");
			displayHeading();
		}
	}
	void displayExit(){
		System.out.println("========================================");
		System.out.println("\t***THANK YOU***");
		System.out.println("\t***VISIT AGAIN***");
		System.out.println("========================================");
	}
	SinglyLinkedList bill=new SinglyLinkedList();
	SinglyLinkedList cusList=new SinglyLinkedList();
	int srNo=0;
	void lg32(){
		SinglyLinkedList list1=new SinglyLinkedList();
		list1.addNode(1,"LG102",17999f);
		list1.addNode(2,"LG104",19999f);
		list1.addNode(3,"LG110",21999f);
		list1.addNode(4,"LGX12",25999f);
		list1.display();
		
		Scanner scan=new Scanner(System.in);
		boolean exit=false;
		//boolean flag=false;
		try{
			while(!exit){
				System.out.print("Enter choice to choose required Model or Press 5 for EXIT : ");
				int choice=scan.nextInt();
				switch(choice){
					case 1:	{
							list1.display();
							System.out.println("Product added to cart!!!");
							list1.display();
							bill.addNode(++srNo,"LG102",17999f);
					}
					break;
					
					case 2:	{
							list1.display();
							System.out.println("Product added to cart!!!");
							list1.display();
							bill.addNode(++srNo,"LG104",19999f);
					}
					break;
				
					case 3:	{
							list1.display();
							System.out.println("Product added to cart!!!");
							list1.display();
							bill.addNode(++srNo,"LG110",21999f);
					}
					break;
				
					case 4:	{
							list1.display();
							System.out.println("Product added to cart!!!");
							list1.display();
							bill.addNode(++srNo,"LGX12",25999f);
					}
					break;
					
					case 5:	exit=true;
							System.out.println("EXIT");
							break;
							
					default:
				}
			}
		}catch(Exception ae){
			ae.getMessage();
			System.out.println("Wrong Input");
			lg32();
		}
		cusList.displayCustomer();
		bill.calculateBill();
	}
	
	void lg45(){
		SinglyLinkedList list2=new SinglyLinkedList();
		list2.addNode(1,"LG500",28999f);
		list2.addNode(2,"LG505",31999f);
		list2.addNode(3,"LG520",40999f);
		list2.addNode(4,"LGXX1",49999f);
		list2.display();
		Scanner scan=new Scanner(System.in);
		boolean exit=false;
		boolean flag=false;
		try{
			while(!exit){
				System.out.print("Enter choice to choose required Model or Press 5 for EXIT : ");
				int choice=scan.nextInt();
				switch(choice){
					case 1:	{
							list2.display();
							System.out.println("Product added to cart!!!");
							list2.display();
							bill.addNode(++srNo,"LG500",28999f);
					}
					break;
					
					case 2:	{
							list2.display();
							System.out.println("Product added to cart!!!");
							list2.display();
							bill.addNode(++srNo,"LG505",31999f);
					}
					break;
				
					case 3:	{
							list2.display();
							System.out.println("Product added to cart!!!");
							list2.display();
							bill.addNode(++srNo,"LG520",40999f);
					}
					break;
				
					case 4:	{
							list2.display();
							System.out.println("Product added to cart!!!");
							list2.display();
							bill.addNode(++srNo,"LGXX1",49999f);
					}
					break;
					
					case 5:	exit=true;
							System.out.println("EXIT");
							break;
							
					default:
				}
			}
		}catch(Exception ae){
			System.out.println("Wrong Input");
			lg45();
		}
		cusList.displayCustomer();
		bill.calculateBill();
	}
	
	void sony32(){
	SinglyLinkedList list3=new SinglyLinkedList();
		list3.addNode(1,"SONY150",19999f);
		list3.addNode(2,"SONY155",21999f);
		list3.addNode(3,"SONY160",22999f);
		list3.addNode(4,"SONY165",24999f);
		list3.display();
		Scanner scan=new Scanner(System.in);
		boolean exit=false;
		boolean flag=false;
		try{
			while(!exit){
				System.out.print("Enter choice to choose required Model or Press 5 for EXIT : ");
				int choice=scan.nextInt();
				switch(choice){
					case 1:	{
							list3.display();
							System.out.println("Product added to cart!!!");
							list3.display();
							bill.addNode(++srNo,"SONY150",19999f);
					}
					break;
				
					case 2:	{
							list3.display();
							System.out.println("Product added to cart!!!");
							list3.display();
							bill.addNode(++srNo,"SONY155",21999f);
					}
					break;
				
					case 3:	{
							list3.display();
							System.out.println("Product added to cart!!!");
							list3.display();
							bill.addNode(++srNo,"SONY160",22999f);
					}
					break;
				
					case 4:	{
							list3.display();
							System.out.println("Product added to cart!!!");
							list3.display();
							bill.addNode(++srNo,"SONY165",24999f);
					}
					break;
					
					case 5:	exit=true;
							System.out.println("EXIT");
							break;
							
					default:
				}
			}
		}catch(Exception ae){
			System.out.println("Wrong Input");
			sony32();
		}
		cusList.displayCustomer();
		bill.calculateBill();
	}
	
	void sony45(){
		SinglyLinkedList list4=new SinglyLinkedList();
		list4.addNode(1,"SONY550",28999f);
		list4.addNode(2,"SONY555",32999f);
		list4.addNode(3,"SONY575",42999f);
		list4.addNode(4,"SONY600",55999f);
		list4.display();
		Scanner scan=new Scanner(System.in);
		boolean exit=false;
		boolean flag=false;
		try{
			while(!exit){
				System.out.print("Enter choice to choose required Model or Press 5 for EXIT : ");
				int choice=scan.nextInt();
				switch(choice){
					case 1:	{
							list4.display();
							System.out.println("Product added to cart!!!");
							list4.display();
							bill.addNode(++srNo,"SONY550",28999f);
					}
					break;
				
					case 2:	{
							list4.display();
							System.out.println("Product added to cart!!!");
							list4.display();
							bill.addNode(++srNo,"SONY555",32999f);
					}
					break;
				
					case 3:	{
							list4.display();
							System.out.println("Product added to cart!!!");
							list4.display();
							bill.addNode(++srNo,"SONY575",42999f);
					}
					break;
				
					case 4:	{
							list4.display();
							System.out.println("Product added to cart!!!");
							list4.display();
							bill.addNode(++srNo,"SONY600",55999f);
					}
					break;
					
					case 5:	exit=true;
							System.out.println("EXIT");
							break;
							
					default:
				}
			}
		}catch(Exception ae){
			System.out.println("Wrong Input");
			sony45();
		}
		cusList.displayCustomer();
		bill.calculateBill();
	}

	void customerDetails(){
		Scanner scan=new Scanner(System.in);
		int billNo=0;
		try{
			System.out.print("Enter your name : ");
			String name=scan.nextLine();
			System.out.print("Enter your Address : ");
			String address=scan.nextLine();
			System.out.print("Enter your phone number : ");
			String phone=scan.nextLine();
			cusList.addNode(++billNo,name,address,"+91 "+phone);
		}catch(Exception ae){
			System.out.println("Wrong Input");
			customerDetails();
		}
	}
}

