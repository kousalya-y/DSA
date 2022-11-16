import java.util.LinkedList;

public class ConnectedGraph {

    private int E;
    private int V;
    private LinkedList<Integer>[ ] adj; 
    private int[] compId;
    
    public ConnectedGraph(int nodes){
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
    public void dfs(){
        boolean visited[] = new boolean[V];
         compId = new int[V];
        int count = 0; //count no. of components

        for(int v=0;v<V;v++){
            if(!visited[v]){
                dfs(v,visited,compId,count);
                count++;
            }
        }
       
    }
    private void dfs(int v, boolean[] visited, int[] compId, int count) { // no base condition 
        visited[v] = true;
        compId[v] = count;
        for(int w : adj[v]){
            if(!visited[v]){
                dfs(w,visited,compId,count);
            }
        }
    }
    public static void main(String[] args) {
        ConnectedGraph g = new ConnectedGraph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(2, 4);
		
		System.out.println(g);
        
        System.out.println();
		
        g.dfs();
    }
    
}
