import java.util.*;
class Prims
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