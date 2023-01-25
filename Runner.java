
public class Runner {

	public static void main(String[] args) {
		
		Linklist list = new Linklist();
		list.insert(5);
		list.insert(20);
		list.insert(45);
		list.insert(32);
		list.show();
		list.insertAt(3, 31);
		list.insertBegin(300);
		list.show();
		list.delete(3);
		list.show();
	}

}
