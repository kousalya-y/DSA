public class graph {
   private static int adj[][];
   private static int v;
   private static int E;
    private graph(int nodes){
         this.adj = new int[nodes][nodes];
         this.v = nodes;
         this.E = 0;

    }


    private static void addEdge(int a, int b){
        adj[a][b] = 1; 
        adj[b][a] = 1;
        E++;
    }
    public static void main(String[] args) {
        graph g = new graph(4);
        g.addEdge(0,1);
       
        g.addEdge(1 , 2);
        
      printMat();
    }


    private static void printMat() {
        for(int i = 0; i < adj.length; i++){
            for(int j = 0; j< adj[i].length;j++){
            System.out.print(adj[i][j] + " ");
        }
        System.out.println();
    }
}
}

