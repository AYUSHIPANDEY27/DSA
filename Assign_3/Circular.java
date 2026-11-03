package assignments;
//Implement add position and delete position in circular linked list.



class CirLinked{
	static class Node{
		private int data;
		private Node next;
		
		public Node(int val) {
			data =val;
			next =null;
		}
	}
	private Node head,tail;
	public CirLinked() {
		head =tail= null;
	}
		
	public void addFirst(int value){
			Node newNode =new Node(value);
			if(head==null) {
			    head =tail =newNode;
			newNode.next =newNode;}
			
			else {
				 newNode.next =head;
				 head = newNode;
				 tail.next =newNode;
			}
		}
		public void add(int val,int pos) {
			Node nN =new Node(val);
			if(head == null) {
				tail =head =nN;
				nN.next =nN;
			}
			else if(pos <= 1) {
				nN.next= head;
				tail.next=nN;
				head = nN;
			}
			else {
				Node trav =head;
				for(int i =1; i<pos-1 && trav!=tail;i++) {
					trav=trav.next;
				}
					nN.next = trav.next;
					trav.next =nN;
					
					if(trav ==tail)
						tail =nN;
					
			}					
		}
		public void display() {
 			Node trav = head;
 			do{
 				System.out.println(" "+trav.data);
 				trav =trav.next;
 			}while(trav!=head);
 			System.out.println();
 			
 		}
	}





public class Circular {

	public static void main(String[] args) {
		CirLinked l1 =new CirLinked();
		l1.addFirst(4);
		l1.addFirst(3);
		l1.addFirst(5);
		l1.addFirst(8);
		l1.addFirst(7);
		l1.addFirst(2);
		
		l1.display();
		l1.add(99,7);
		l1.add(80, -1);
		l1.display();

	}

}
