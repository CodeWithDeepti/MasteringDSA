package one.six.zero.days.dsa.graph;

import java.io.*;
import java.util.*;

/*Given a connected undirected graph containing V vertices, represented by a 2-d adjacency list adj[][], where each adj[i] represents the list of vertices connected to vertex i. Perform a Breadth First Search (BFS) traversal starting from vertex 0, visiting vertices from left to right according to the given adjacency list, and return a list containing the BFS traversal of the graph.

Note: Do traverse in the same order as they are in the given adjacency list.
*/

class Day139BFSOfGraph {
	 // Function to return Breadth First Search Traversal of given graph.
	 public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
	     boolean visitedArr[] = new boolean[adj.size()];
	     ArrayList<Integer> output = new ArrayList<Integer>();
	     Queue<Integer> que = new LinkedList<>();
	     int i=0;
	     visitedArr[i]=true;
	     que.add(0);
	     
	     while(!que.isEmpty()){
	         int currentElement = que.poll();
	         output.add(currentElement);
	         
	         for(int value :  adj.get(currentElement)){
	             if(!visitedArr[value]){
	                 visitedArr[value]=true;
	                 que.add(value);
	             }
	         }
	         
	     }	     
	     return output;    
 }
 


 public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int tc = Integer.parseInt(br.readLine().trim());

     while (tc-- > 0) {
         int V = Integer.parseInt(br.readLine().trim());
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

         for (int i = 0; i < V; i++) {
             String[] input = br.readLine().trim().split(" ");
             ArrayList<Integer> node = new ArrayList<>();
             for (String s : input) {
                 if (!s.isEmpty()) {
                     node.add(Integer.parseInt(s));
                 }
             }
             adj.add(node);
         }

         Day139BFSOfGraph obj = new Day139BFSOfGraph();
         ArrayList<Integer> ans = obj.bfs(adj);
         for (int num : ans) {
             System.out.print(num + " ");
         }
         System.out.println();
         System.out.println("~");
     }
 }
}

