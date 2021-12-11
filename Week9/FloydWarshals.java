import java.util.*;
class FloydWarshals
{
	public static void main(String args[])
	{
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int graph[][]= new int[n][n];
		int dist[][]= new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				graph[i][j]=scn.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				dist[i][j]=graph[i][j];
			}
		}

		for(int k=0;k<n;k++)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(dist[i][j]>dist[i][k]+dist[k][j])
					{
						dist[i][j]=dist[i][k]+dist[k][j];
					}
				}
			}
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(dist[i][j]+"  ");
			}
			System.out.println();
		}
	}
}