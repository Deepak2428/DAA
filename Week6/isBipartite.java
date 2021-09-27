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
    public static boolean isBipartite(ArrayList<Edge> graph[],int src, int visited[])
    {
        ArrayDeque<pair> q= new ArrayDeque<>();
        
        q.add(new pair(src,0));
        
        while(q.size()>0)
        {
            pair rem= q.removeFirst();
            
            if(visited[rem.v]!=-1)
            {
                if(rem.level!=visited[rem.v])
                {
                    return false;
                }
            }
            else
            {
                visited[rem.v]=rem.level;
            }
            for(Edge e: graph[rem.v])
            {
                if(visited[e.nbr]==-1)
                {
                    q.add(new pair(e.nbr,rem.level+1));
                }
            }
        }
        
        return true;
    }
}