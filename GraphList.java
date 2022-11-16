import java.beans.Visibility;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphList {

    private int E;
    private int V;
    private LinkedList<Integer>[ ] adj; 
    
    public GraphList(int nodes){
        this.V = nodes;
        this.E = 0;
        adj = new LinkedList[nodes];
        for(int i = 0 ;i < V; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for(int v = 0; v < V; v++) {
			sb.append(v + ": ");
			for(int w : adj[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
    }

    public void bfs(int s){
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList();
        visited[s] = true;
        q.offer(s);

        while(!q.isEmpty()){
            int temp = q.poll();
            System.out.print(temp +" ");
            for(int w : adj[temp])
            {
                if(visited[w]!= true){
                    visited[w] = true;
                    q.offer(w);
                }
            }
        }
    }

    public static void main(String[] args) {
		GraphList g = new GraphList(5);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		System.out.println(g);
        g.bfs(0);
        System.out.println();
		g.recurdfs();
        System.out.println();
        g.dfs(0);
	}

    private void dfs(int i) {
        boolean visited[] = new boolean[V];
        Stack<Integer> st = new Stack();
        
        st.push(i);
        while(!st.isEmpty()){
                  int u = st.pop();
                  if(!visited[u])
                  {
                  visited[u] = true;
                  System.out.print(u + " ");
                  for(int w : adj[u]){
                    if(!visited[w]){
                        st.push(w);
                      }
                  }
                }
    }
}

    private void recurdfs() {
        boolean[] visited = new boolean[V];
        for(int v = 0; v<V;v++){
            if(!visited[v]){
                recurdfs(v, visited);
            }
        }
    }

    private void recurdfs(int v2, boolean[] visited) {
        visited[v2] = true;
        System.out.print(v2+" ");
        for(int w : adj[v2]){
            if(!visited[v2]){
                recurdfs(v2,visited);
            }
        }

    }
    
}
