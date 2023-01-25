package traversal;
import java.util.*;
public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob= new Scanner(System.in);
		int n = ob.nextInt();
		int e = ob.nextInt();
		int adj[][] = new int[n][n];
		for(int i=0; i<e; i++) {
			int v1 = ob.nextInt();
			int v2 = ob.nextInt();
			adj[v1][v2] = 1;
			adj[v2][v1] = 1;
		}
		//printing the adjacency matrix which contains 1 if edge exits between two verices
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}
		//calling BFS function to print the order
		boolean visited[]= new boolean[n];
		System.out.print("The Breath First Search Traversal gives the below sequence\n");
		bfs(adj, visited, 0);
		ob.close();
	}
	public static void bfs(int[][] adj, boolean[] visited, int starting_node) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(starting_node);
		visited[starting_node] = true;
		while(!q.isEmpty()) {
			int ele = q.remove();
			System.out.print(ele + " ");
			for(int i=0; i<adj.length; i++) {
				if(!visited[i] && adj[starting_node][i] == 1) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
}
