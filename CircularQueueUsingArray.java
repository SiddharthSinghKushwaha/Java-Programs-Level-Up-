/*Capacity is not used that is if the Queue is full then it not double*/
class QueueEmptyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
public class CircularQueueUsingArray {
	int[] Queue;
	int front;
	int rear;
	int size;
	final int MAX = 5;
	CircularQueueUsingArray(){
		Queue = new int[MAX];
		front = -1;
		rear = -1;
		size = 0;
	}
	private int size() {
		return size;
	}
	private int peek() throws QueueEmptyException { //peek
		if(isEmpty()) 
			throw new QueueEmptyException();
		else
			return Queue[front];
	}
	private boolean isFull() {
		if((rear == MAX-1 && front == 0) || front == rear + 1)
			return true;
		else
			return false;
	}
	private boolean isEmpty() {
		if( (rear == -1) && (front == -1))
			return true;
		else
			return false;
	}
	private void enQueue(int data) {
		if(isFull())
			System.out.println("The Queue is full");
		else {
			if(size == 0)
				front =0;
			rear = (rear + 1) % MAX;
			Queue[rear] = data;
			size++;
			System.out.println("The element is Inserted");
		}
	}
	public int deQueue() throws QueueEmptyException{
		if(isEmpty()) 
			throw new QueueEmptyException();
		else if( rear == front) {
			int del = Queue[front];
			front = -1;
			rear = -1;
			size--;
			return del;
		}
		else {
			int del = Queue[front];
			front = (front+1) % MAX;
			size--;
			return del;
		}
	}
	public static void main(String args[]) {
		CircularQueueUsingArray cq= new CircularQueueUsingArray();
		
		cq.enQueue(5);
		cq.enQueue(15);
		cq.enQueue(31);
		System.out.println("The current size "+ cq.size());
		try {
			System.out.println("The current front of the Queue is "+ cq.peek());
		}
		catch(Exception e) {
			System.out.println("An exception occurs: Queue is Empty- Front can't be displayed");
		}
		try {
			System.out.println("The current deleted element is "+ cq.deQueue());
		}
		catch(Exception e) {
			System.out.println("An exception occurs: Queue is Empty- Element can't be deleted");
		}
		System.out.println("The current size "+ cq.size());
	}
}
