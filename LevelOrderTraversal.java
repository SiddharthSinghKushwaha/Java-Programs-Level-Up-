import java.util.Queue;
import java.util.LinkedList;
class TreeNode{
	int data;
	TreeNode left, right;
	public TreeNode(int item){
		data = item;
		left = null;
		right = null;
	}
}
public class LevelOrderTraversal {
	TreeNode root;
	void printLevelOrder() {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while( !queue.isEmpty()) {
			TreeNode tempNode = queue.poll(); // return head of queue
			if( tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if( tempNode.right != null) {
				queue.add(tempNode.right);
			}
			System.out.print(tempNode.data + " -> ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderTraversal tree_level = new LevelOrderTraversal(); 
        tree_level.root = new TreeNode(1); 
        tree_level.root.left = new TreeNode(2); 
        tree_level.root.right = new TreeNode(3); 
        tree_level.root.left.left = new TreeNode(4); 
        tree_level.root.left.right = new TreeNode(5); 

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();

	}

}
