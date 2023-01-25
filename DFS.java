package traversal;

import java.util.*;
public class DFS {	//Depth First Search without stack 

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
		//calling DFS function to print the order
		boolean visited[]= new boolean[n];
		System.out.print("The Depth First Search Traversal gives the below sequence\n");
		dfs(adj, visited, 0);	// 0 is from which we start the graph 
		ob.close();
	}
	public static void dfs(int[][] adj, boolean[] visited, int starting_node) {
		System.out.print(starting_node + " ");
		visited[starting_node] = true;
		for(int i=0; i<adj.length; i++) {
			if(!visited[i] && adj[starting_node][i] == 1) {
				dfs(adj, visited, i);
			}
		}
	}
}
