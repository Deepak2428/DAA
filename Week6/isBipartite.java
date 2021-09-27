import java.util.*;
class isBipartite
{
    static class Edge
    {
        int v;
        Edge(int v)
        {
            this.v=v;
        }
    }
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        System.out.print("\n Enter no of vertices : ");
        int vtces=scn.nextInt();
        ArrayList<Edge> graph[]= new ArrayList [vtces];
        for(int i=0;i<vtces;i++)
        {
            graph[i]=new ArrayList<>();
        }
        System.out.print("\n Enter no of edges : ");
        int E= scn.nextInt();
        
        for(int i=0;i<E;i++)
        {
            int v1=scn.nextInt();
            int v2=scn.nextInt();
            graph[v1].add(new Edge(v1,v2));
            graph[v2].add(new Edge(v2,v1));
        }
	int visited[]= new int[vtces];
        Arrays.fill(visited,-1);
        System.out.print("\n\n IS BIPARTITE : ");
        for(int i=0;i<vtces;i++)
        {
            if(visited[i]==-1)
            {
                boolean ans=isBipartite(graph,i,visited);
                if(ans==false)
                {
                    System.out.print(false);
                    return;
                }
                
            }
        }
        System.out.print(true);
    }