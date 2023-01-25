//import java.io.*;
class StackEmptyException1 extends Exception{

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
public class StackUsingLinkedList {
	Node head;
	int size;
	StackUsingLinkedList(){
		head = null;
		size = 0;
	}
	public int size() {
		return size;
	}
	public int peek() throws StackEmptyException1{
		return head.data;
	}
	public boolean isEmpty() {
		if( size == 0)
			return true;
		else
			return false;
	}
	public void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
		size++;
	}
	public int pop() throws StackEmptyException1{
		int y= head.data;
		head = head.next;
		return y;
	}
	public static void main(String[] args) {
		StackUsingLinkedList s= new StackUsingLinkedList();

		try {
			System.out.println("Current deleted Element is: " + s.pop());
		}
		catch(Exception e){
			System.out.println("An Exception Occurs: Stack is empty- pop operation1");
		}
		s.push(5);
		s.push(15);
		
		try {
			System.out.println("Current deleted Element is: " + s.pop());
		}
		catch(Exception e){
			System.out.println("An Exception Occurs: Stack is empty- pop operation");
		}
		try {
			System.out.println("Current peek Element is: "+ s.peek());
		}
		catch(Exception e){
			System.out.println("An Exception Occurs: Stack is empty- peek operationS");
		}
		
	}

}