import java.util.*;
public class Activity
{
	static class Pair implements Comparable<Pair>
    	{
        int st;
        int et;
        Pair(int st,int et)
        {
            this.et=et;
            this.st=st;
        }
        public int compareTo(Pair o)
        {
            return this.et-o.et;
        }
    	}
    public static void main(String args[])	
	{
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int st[]= new int[n];
		int et[]= new int[n];
		for(int i=0;i<n;i++)
		{
			st[i]=scn.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			et[i]=scn.nextInt();
		}
		System.out.print("\nMax activities : "+activitySelection(st,et,n));
	} 


    public static int activitySelection(int start[], int end[], int n)
    {
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            pq.add(new Pair(start[i],end[i]));
        }
        int count=1;
        Pair rem=pq.remove();
        
        while(pq.size()>0)
        {
            Pair rem1=pq.remove();
            if(rem.et<rem1.st)
            {
                rem=rem1;
                count++;
            }
        }
        return count;
    }
}