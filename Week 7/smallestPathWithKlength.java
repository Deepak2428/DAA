import java.util.*;
class smallestPathWithKpathLength
{
    static class Edge
    {
        int v;
        int nbr;
        int wt;
        
        Edge(int v,int nbr,int wt)
        {
            this.v=v;
            this.nbr=nbr;
            this.wt=wt;
    }
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        System.out.print("\n Enter number of vertices : ");
        int vtces=scn.nextInt();
        
        ArrayList<Edge> graph[]= new ArrayList[vtces];
        
        for(int i=0;i<vtces;i++)
        {
            graph[i]=new ArrayList<>();
        }
        
        System.out.println("\n Enter number of edges: ");
        
        int E=scn.nextInt();

	for(int i=0;i<E;i++)
        {
            int v1=scn.nextInt();
            int v2=scn.nextInt();
            int wt=scn.nextInt();
            
            graph[v1].add(new Edge(v1,v2,wt));
            graph[v2].add(new Edge(v2,v1,wt));
        }
        System.out.print("\n Enter Source node : ");
        int src=scn.nextInt();
        System.out.print("\n Enter destination node : ");
        int dest=scn.nextInt();
        System.out.print("\n Enter value of k : ");
        int k=scn.nextInt();
        boolean visited[]= new boolean[vtces];
        
        dfs(graph,visited,src,dest,k,0,""+src);
        
        System.out.print("\n Shortest path with k length is : "+path+" @ "+pathwt);
        
    }
    