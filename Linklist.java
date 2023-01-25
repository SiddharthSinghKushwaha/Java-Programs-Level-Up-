
public class Linklist {
	Node head;
	public void insert(int data) {
		Node node = new Node() ;
		node.data = data;
		
		if(head == null)
			head = node;
		else {
			Node n = head;
			while( n.next != null)
				n = n.next;
			
			n.next = node;
		}
				
	}
	public void insertBegin(int data) {
		Node node = new Node();
		node.next = head;
		node.data = data;
		head = node;
	}
	public void insertAt(int index, int data) {
		if(index == 0)
			insertBegin(data);
		else {
			Node node = new Node() ;
			node.data = data;
			
			Node n = head;
			for(int i=0; i< index-1; i++)
				n = n.next;
			
			node.next = n.next;
			n.next = node;
		}
	}
	public void show() {
		Node temp = head;
		while( temp != null) {
			System.out.print( temp.data + "-> ");
			temp = temp.next;
		}
		System.out.println();
	}
	public void delete(int index) {
		if(index == 0)
			head = head.next;
		else {
			Node n1 = null;
			Node temp = head;
			for(int i=0; i< index-1; i++) {
				temp = temp.next;
			}
			n1 = temp.next;
			temp.next = n1.next;
			System.out.println("The delete node is "+ n1.data);
			n1 = null;
		}
	}

}
