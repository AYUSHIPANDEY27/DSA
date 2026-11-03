package assignments;

//2.Write a function which will insert values in sorted order into linked list.

class Linked{
	
		static class Node{
			private int data;
			private Node next;
			
			public Node(int value) {
				data= value;
				next = null;
			}
		}
		private Node head;
		public Linked() {
			head = null;
		}
		
		public void display() {
			Node trav =head;
			while(trav != null) {
				System.out.println(" "+trav.data);
				trav =trav.next;
			}
			System.out.println();
		}
		
		public void add(int value) {
			Node nN =new Node(value);
			if(head == null || value <head.data) {
				nN.next =head;
				head =nN;
		}
			else
			 {
				Node trav =head;
				while(trav.next!=null && trav.next.data<value) {
					trav =trav.next;
				}
				nN.next =trav.next;
				trav.next=nN;
			}
			
		}
	}





public class Sorted {

	public static void main(String[] args) {
		Linked l1 = new Linked();

		l1.add(30);
		l1.add(80);
		l1.add(10);
		l1.add(40);
		l1.add(60);
		l1.add(10);
		l1.display();

	}

}
