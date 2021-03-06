import java.util.*;
class Edge
{
    int v;
    int nbr;
    Edge(int v,int nbr)
    {
        this.v=v;
        this.nbr=nbr;
    }
}
class hasPath
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of vertices : ");
        int vtces= scn.nextInt();
        ArrayList<Edge> graph[]= new ArrayList[vtces];
        for(int i=0;i<vtces;i++)
        {
            graph[i]=new ArrayList<>();
        }
        System.out.print("\nEnter number of Edges : ");
        int e=scn.nextInt();
        for(int i=0;i<vtces;i++)
        {
            graph[i]=new ArrayList<>();
        }
        System.out.print("\nEnter number of Edges : ");
        int e=scn.nextInt();
        for(int i=0;i<e;i++)
        {
            int v1=scn.nextInt();
            int v2=scn.nextInt();
            
            graph[v1].add(new Edge(v1,v2));
            graph[v2].add(new Edge(v2,v1));
        }
        
        
        System.out.print("\n Enter source node: ");
        int src= scn.nextInt();
        System.out.print("\n Enter destination node: ");
        int dest=scn.nextInt();
        boolean visited[]= new boolean[vtces];
        System.out.println("\nIs there a path : "+hasPath(graph,src,dest,visited));
        
    }
	public static boolean hasPath(ArrayList<Edge> graph[],int src, int dest,boolean visited[])
    	{
        	if(src==dest)
        	{
            	return true;
        	}
        
        	visited[src]=true;
        
        	for(Edge e: graph[src])
        	{
            	if(visited[e.nbr]==false)
            	{
                boolean ans=hasPath(graph,e.nbr,dest,visited);
                if(ans==true)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
