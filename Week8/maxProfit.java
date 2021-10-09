import java.util.*;
class maxProfit
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
    }
    
    static class pair implements Comparable<pair>
    {
        int v;
        int av;
        int wt;
        pair(int v,int av,int wt)
        {
            this.v=v;
            this.av=av;
            this.wt=wt;
        }
        
        public int compareTo(pair o)
        {
            return this.wt- o.wt;
        }
    }
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        
        System.out.print("\n Enter number of vertices: ");
        int vtces=scn.nextInt();
        
        
        ArrayList<Edge> graph[]= new ArrayList[vtces];
        
        
        for(int i=0;i<vtces;i++)
        {
            graph[i]=new ArrayList<>();
        }
        
        
        System.out.print("\n Enter number of Edges: ");
        int E=scn.nextInt();
        
        for(int i=0;i<E;i++)
        {
            int v1=scn.nextInt();
            int v2=scn.nextInt();
            int wt= scn.nextInt();
            
            graph[v1].add(new Edge(v1,v2,wt));
            graph[v2].add(new Edge(v2,v1,wt));
        }
        
        boolean visited[]= new boolean[vtces];
        PriorityQueue <pair> pq= new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new pair(0,-1,0));
        
        pair rem= pq.remove();
        
        visited[rem.v]=true;
        
        for(Edge e: graph[rem.v])
        {
            if(visited[e.nbr]==true)
            {
                continue;
            }
            pq.add(new pair(e.nbr,rem.v,e.wt));
        }
        int wsf=0;
        while(pq.size()>0)
        {
            rem= pq.remove();
            
            if(visited[rem.v]==true)
            {
                continue;
            }
            visited[rem.v]=true;
            wsf=wsf+rem.wt;
            
            for(Edge e: graph[rem.v])
            {
                if(visited[e.nbr]==false)
                {
                    pq.add(new pair(e.nbr,rem.v,e.wt));
                }
            }
            
            
            
            
        }
        System.out.print("\n Minuinum spanning weight is : "+wsf);
    }