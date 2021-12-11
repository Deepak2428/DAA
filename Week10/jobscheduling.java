import java.util.*;
class jobscheduling
{
	static class Pair implements Comparable<Pair>
	{
		int id;
		int et;
		Pair(int id,int et)
		{
			this.id=id;
			this.et=et;
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
		int id[]= new int[n];
		int deadline[]= new int[n];
		for(int i=0;i<n;i++)
		{
			id[i]=scn.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			deadline[i]=scn.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(deadline[i]>max)
			{
				max=deadline[i];
			}
		}
		int a[]= new int[max];
		int k=0;
		int time=0;
		Arrays.fill(a,-1);
		PriorityQueue<Pair> pq= new PriorityQueue<>();
		for(int i=0;i<n;i++)
		{
			pq.add(new Pair(id[i],deadline[i]));
		}
		while(pq.size()>0&&k<max)
		{
			Pair rem= pq.remove();
			if(time+rem.id<=rem.et)
			{
				time+=rem.id;
				k++;
			}
		}
		System.out.print("\n Activities are : "+k);
	}
}
		
		
		
				

		