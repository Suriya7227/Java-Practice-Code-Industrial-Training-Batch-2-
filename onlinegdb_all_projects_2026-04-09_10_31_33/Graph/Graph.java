import java.util.*;
public class Graph{
    public static final int MAX = 10;
    private int[][] adjMatrix  = new int[MAX][MAX];
    public void addEdge(int u,int v){
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }
    public void printGraph(int vertices){
        System.out.println("Adjacency Matrix:");
        for(int i = 0;i < vertices;i++){
            for(int j = 0;j < vertices;j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Graph g = new Graph();
        System.out.print("Enter number of vertices:");
        int vertices = sc.nextInt();
        System.out.print("Enter number of edges:");
        int edges = sc.nextInt();
        System.out.println("Enter edges (u v) :");
        for(int i = 0;i < edges;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u,v);
        }
        g.printGraph(vertices);
        sc.close();
    }
}