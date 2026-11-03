package assignments;
//1.In singly linear linked list implement following operations.
//i. insert a new node after a given data
//ii. insert a new node before a given data

class LinearList{
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data= value;
			next = null;
		}
	}
	private Node head;
	public LinearList() {
		head = null;
	}
	
	public void add(int value) {
		Node nN =new Node(value);
		if(head==null) {
			head =nN;
		}
		else {
			nN.next =head;
			head =nN;
		}
	}
	
	
	
	
	public void addAfter(int value,int target) {
		Node nN =new Node(value);
		Node trav =head;
		while(trav!= null) {
			
		if(trav.data==target) {
			nN.next = trav.next;
			trav.next = nN;
			return;
		}trav= trav.next;
		}
	}
	
	public void addBefore(int value,int target) {
		Node nN =new Node(value);
		if(head == null)
			return;
		Node trav =head;
		if(head.data == target) {
			nN.next =head;
		head =nN;
		return;
	}
		
		while(trav.next !=null&& trav.next.data !=target) {
			trav = trav.next;
		}
		if(trav.next !=null) {
				nN.next =trav.next;
				trav.next = nN;
		}
	      }	
		
		
	
	
	
	public void display() {
		Node trav = head;
		while(trav !=null) {
	         System.out.println(" "+trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
	
	
}



public class Linewar {

	public static void main(String[] args) {
		LinearList l1 = new LinearList();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.display();
		l1.addAfter(60,30);
		l1.display();
		l1.addBefore(70,20);
		l1.display();

	}

}
