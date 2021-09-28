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