class QueueEmptyExceptioin extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
public class QueueUsingArray {
	int[] Queue;
	int front;
	int rear;
	int size;
	QueueUsingArray(){
		Queue = new int[5];
		front = 0;
		rear = -1;
		size = 0;
	}
	public int size() {
		return size;
	}
	public int front() throws QueueEmptyExceptioin { //peek
		if(isEmpty()) 
			throw new QueueEmptyExceptioin();
		else
			return Queue[front];
	}
	public boolean isEmpty() {
		if(rear == -1 || front> rear)
			return true;
		else
			return false;
	}
	public void enQueue(int data) {
		if(rear == 4)
			System.out.println("The Queue is full");
		else {
			rear++;
			Queue[rear] = data;
			size++;
			System.out.println("The element is Inserted");
		}
	}
	public int deQueue() throws QueueEmptyExceptioin{
		if(isEmpty()) 
			throw new QueueEmptyExceptioin();
		else {
			int del = Queue[front];
			front++;
			size--;
			return del;
		}
	}
	public static void main(String args[]) {
		QueueUsingArray q= new QueueUsingArray();
		try {
			System.out.println("The front of the Queue is "+ q.deQueue());
		}
		catch(Exception e) {
			System.out.println("An exception occurs: Queue is Empty- Element can't be deleted");
		}
		q.enQueue(5);
		q.enQueue(15);
		q.enQueue(31);
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
		try {
			System.out.println("The current front of the Queue is "+ q.front());
		}
		catch(Exception e) {
			System.out.println("An exception occurs: Queue is Empty- Front can't be displayed");
		}
	}
}
