 import java.util.*;
 class bellman
 
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
 	
 	public static void main(String args[])
 	{
 		Scanner scn= new Scanner(System.in);
 		int V= scn.nextInt();
 		
 		ArrayList<Edge> graph[]= new ArrayList[V];
 		
 		for(int i=0;i<V;i++)
 		{
 			graph[i]=new ArrayList<>();
 		}
 		
 		int E=scn.nextInt();
 		
 		for(int i=0;i<E;i++)
 		{
 			int v1=scn.nextInt();
 			int v2=scn.nextInt();
 			int wt=scn.nextInt();
 			graph[v1].add(new Edge(v1,v2,wt));
 			//graph[v2].add(new Edge(v2,v1,wt));
 		}
 		
 		int path[]= new int[V];
 		
 		Arrays.fill(path,(Integer.MAX_VALUE/2));
 		
 		path[0]=0;
 		for(int h=0;h<V-1;h++){
 		for(int i=0;i<E;i++)
 		{
 			for(Edge e: graph[i])
 			{
 				int u=e.v;
 				int v=e.nbr;
 				int wt=e.wt;
 				
 				if(path[u]+wt<path[v])
 				{
 					path[v]=path[u]+wt;
 				}
 			}
 		}
 		}
 		for(int i=0;i<V;i++)
 		{
 			System.out.print(path[i]+" ");
 		}
 	}
}
 		
 		
 		
 		
 		
