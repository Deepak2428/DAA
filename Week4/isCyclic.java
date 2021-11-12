import java.util.*;
class isCyclic
{
    static class Edge
    {
        int v;
        int nbr;
        Edge(int v,int nbr)
        {
            this.v=v;
            this.nbr=nbr;
        }
    }
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int v=scn.nextInt();
        ArrayList<Edge>graph[]= new ArrayList[v];
        
        for(int i=0;i<v;i++)
        {
            graph[i]=new ArrayList<>();
        }
        int e=scn.nextInt();
        
        for(int i=0;i<e;i++)
        {
            int v1=scn.nextInt();
            int v2=scn.nextInt();
	    graph[v1].add(new Edge(v1,v2));
            graph[v2].add(new Edge(v2,v1));
        }
        boolean visited[]= new boolean[v];
        System.out.print("Is Cyclic : ");
        for(int i=0;i<v;i++)
        {
            if(visited[i]==false)
            {
                boolean ans=bfs(graph,i,visited);
                if(ans==true)
                {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
        
    }
    
    public static boolean bfs(ArrayList<Edge> graph[],int src,boolean visited[])
    {
        ArrayDeque<Integer> q= new ArrayDeque<>();
        q.offer(src);
        while(q.size()>0)
        {
            int rem=q.pollFirst();
            if(visited[rem]==false)
            {
                visited[rem]=true;
            }
            else
            {
                return true;
            }
            for(Edge e: graph[rem])
            {
                if(visited[e.nbr]==false)
                {
                    q.offer(e.nbr);
                }
            }
        }
        return false;
    }
}