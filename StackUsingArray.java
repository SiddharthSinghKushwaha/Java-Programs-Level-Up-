//import java.io.*;
class StackEmptyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
public class StackUsingArray {
	int[] stack;
	int top;
	StackUsingArray(){
		stack = new int[5];
		top = -1;
	}
	public int size() {
		return top + 1;
	}
	public int peek() {
		return stack[top];
	}
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	public void push(int data) {
		top++;
		if(stack.length == top)
			doubleCapacity();
		stack[top] = data;
		System.out.println("Element Inserted into the Stack");
	}
	public void doubleCapacity() {
		int[] temp= stack;
		stack = new int[2*stack.length];
		for(int i=0; i< temp.length ; i++) {
			stack[i] = temp[i];
		}
	}
	public int pop() throws StackEmptyException{
		if(top == -1)
			throw new StackEmptyException();
		int  del = stack[top];
		top--;
		return del;
	}
	public static void main(String[] args) {
		StackUsingArray s= new StackUsingArray();

		try {
			System.out.println("Current deleted Element is: " + s.pop());
		}
		catch(Exception e){
			System.out.println("An Exception Occurs: Stack is empty");
		}
		s.push(5);
		s.push(15);
		
		try {
			System.out.println("Current deleted Element is: " + s.pop());
		}
		catch(Exception e){
			System.out.println("An Exception Occurs: Stack is empty");
		}
		try {
			System.out.println("Current peek Element is: "+ s.peek());
		}
		catch(Exception e){
			System.out.println("An Exception Occurs: Stack is empty");
		}
		
	}

}