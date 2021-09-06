package dsa.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class graph {

	private ArrayList<ArrayList<Integer>> adj ;
	public graph(int V) {
		adj = new ArrayList<ArrayList<Integer> >(V);
		for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
	}
	void addEdge(int u,int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	void printGraph() {
		for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "+adj.get(i).get(j));
            }
//            System.out.println();
        }
	}
	void Bfs(int source) {
		boolean[] vis = new boolean[adj.size()];
		
		Queue<Integer> qt = new LinkedList<>();
		System.out.println("BFS: ");
		vis[source]=true;
		qt.add(source);
		while(!qt.isEmpty()) {
			int cur = qt.poll();
			System.out.print(cur+" ");
			
			for(int temp:adj.get(cur)) {
				if(!vis[temp]) {
					vis[temp]=true;
					qt.add(temp);
				}
				
			}
		}
	}
	void Dfs(int source) {
		boolean[] vis = new boolean[adj.size()];
		Stack<Integer> st = new Stack<>();
		
		st.push(source);
		System.out.println("DFS: ");
		while(!st.isEmpty()) {
			int cur = st.pop();
			if(vis[cur]==false) {
				System.out.print(cur+" ");
				vis[cur]=true;
			}
			for(int temp:adj.get(cur)) {
				if(!vis[temp]) {
					st.push(temp);
				}
				
			}
				
		}
	}
	
}
