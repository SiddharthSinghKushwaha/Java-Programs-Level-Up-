import java.util.Scanner;

class Node1
{
    int key;
    Node1 left, right;
    public Node1(int item)
    {
        key = item;
        left = right = null;
    }
}
public class BinaryTreesTraversal
{
    Node1 root;
    BinaryTreesTraversal()
    {
        root = null;
    }
    void printPostorder(Node1 node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }
    void printInorder(Node1 node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }
    void printPreorder(Node1 node)
    {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    void printPostorder() {     printPostorder(root); }
    void printInorder() {     printInorder(root); }
    void printPreorder() {     printPreorder(root); }
    static Node1 insert(Node1 nroot, int ele) {
    	if(nroot == null) {
    		nroot = getNode(ele);
    	}
    	else if(ele <= nroot.key) {
    		nroot.left = insert(nroot.left, ele);
    	}else {
    		nroot.right = insert(nroot.right, ele);
    	}
    	return nroot;
    }
    static Node1 getNode(int data) {
    	Node1 n = new Node1(data);
    	n.key = data;
    	return n;
    }
    public static void main(String[] args)
    {
    	BinaryTreesTraversal tree = new BinaryTreesTraversal();
    	Scanner ob =new Scanner(System.in);
    	System.out.println("How many elements: ");
    	int n = ob.nextInt();
    	System.out.println("Start entering the elements in BST: ");
    	int ele = 0;
    	for(int i=0; i<n; i++) {
    		ele = ob.nextInt();
    		tree.root = insert(tree.root, ele);
    	}
        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
        ob.close();
    }
}