import java.util.*;
class dijkstras
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
		int wsf;
		pair(int v,int wsf)
		{
			this.v=v;
			this.wsf=wsf;
		}
		public int compareTo(pair o)
		{
			return this.wsf-o.wsf;
		}
	}
	public static void main(String args[])
	{
		Scanner scn= new Scanner(System.in);
		System.out.print("\n Enter number of friends : ");
		int vtces= scn.nextInt();
		ArrayList<Edge> graph[]= new ArrayList[vtces];
		System.out.print("\n Enter all edges : ");
		int E=scn.nextInt(); 
		for(int i=0;i<vtces;i++)
		{
			graph[i]=new ArrayList<>();
		}
		
		for(int i=0;i<E;i++)
		{
			int v1=scn.nextInt();
			int v2=scn.nextInt();
			int wt=scn.nextInt();
			graph[v1].add(new Edge(v1,v2,wt));
			graph[v2].add(new Edge(v2,v1,wt));
		}
		
		boolean visited[]= new boolean[vtces];
		PriorityQueue<pair> pq = new PriorityQueue<>();
		System.out.print("\n Enter the source home : ");
		int src=scn.nextInt();
		
		pq.add(new pair(src,0));

		while(pq.size()>0)
		{
			pair rem= pq.remove();
			
			if(visited[rem.v]==true)
			{
				continue;
			}
			visited[rem.v]=true;
			
			System.out.println("["+src+"-"+rem.v+"@"+rem.wsf+"]");

			for(Edge e: graph[rem.v])
			{
				if(visited[e.nbr]==false)
				{
					pq.add(new pair(e.nbr,rem.wsf+e.wt));
				}
			}
		}
	}
}
		
			