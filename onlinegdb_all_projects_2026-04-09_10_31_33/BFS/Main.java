import java.util.*;
public class Main{
    static final int MAX = 10;
    static int[][] adjMatrix = new int[MAX][MAX];
    static int[] visited = new int[MAX];
    static int n;
    static void BFS(int start){
        int[] queue = new int[MAX];
        int front = 0,rear = 0;
        System.out.print(start + " ");
        visited[start] = 1;
        queue[rear++] = start;
        while(front < rear){
            int current = queue[front++];
            for(int i = 0;i < n;i++){
                if(adjMatrix[current][i] == 1 && visited[i] == 0){
                    System.out.print(i + " ");
                    visited[i] = 1;
                    queue[rear++] = i;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int edges,u,v;
        System.out.print("Enter number of vertices:");
        n = sc.nextInt();
        System.out.print("Enter number of edges:");
        edges = sc.nextInt();
        for(int i = 0;i < n;i++){
            visited[i] = 0;
            for(int j = 0;j < n;j++){
                adjMatrix[i][j] = 0;
            }
        }
        for(int i = 0;i < edges;i++){
            System.out.print("Enter edge (u v):");
            u = sc.nextInt();
            v = sc.nextInt(); 
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;
        }
        System.out.print("BFS Traversal starting from vertex 0: ");
        BFS(0);
        sc.close();
    }
}