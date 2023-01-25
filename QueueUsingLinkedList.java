
class QueueEmptyException1 extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}
public class QueueUsingLinkedList {
	Node front;
	Node rear;
	int size;
	QueueUsingLinkedList(){
		front = null;
		rear = null;
		size =0 ;
	}
	private int size() {
		return size;
	}
	private int front() throws QueueEmptyException1 { //peek
		if(isEmpty()) 
			throw new QueueEmptyException1();
		else
			return front.data;
	}
	private boolean isEmpty() {
		return size == 0;
	}
	private void enQueue(int data) {
		Node temp = new Node(data);
		if(size == 0) {
			front = temp;
			rear = temp;
		}
		else {
			rear.next = temp;
			rear = temp;
		}
		System.out.println("Element inserted");
		size++;
	}
	public int deQueue() throws QueueEmptyException1{
		if(isEmpty()) 
			throw new QueueEmptyException1();
		int y= front.data;
		size--;
		front = front.next;
		return y;
	}
	public static void main(String args[]) {
		QueueUsingLinkedList q= new QueueUsingLinkedList();
		
		q.enQueue(5);
		q.enQueue(15);
		q.enQueue(31);
		System.out.println("The current size "+ q.size());
		try {
			System.out.println("The current front of the Queue is "+ q.front());
		}
		catch(Exception e) {
			System.out.println("An exception occurs: Queue is Empty- Front can't be displayed");
		}
		try {
			System.out.println("The current deleted element is "+ q.deQueue());
		}
		catch(Exception e) {
			System.out.println("An exception occurs: Queue is Empty- Element can't be deleted");
		}
		System.out.println("The current size "+ q.size());
		q.enQueue(45);
		q.enQueue(33);
		q.enQueue(300);
		System.out.println("The current size "+ q.size());
	}
}
