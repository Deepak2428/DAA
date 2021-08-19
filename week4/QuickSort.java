import java.util.*;
class QuickSort
{
	public static void main(String args[])
	{
		Scanner scn= new Scanner(System.in);
		int t= scn.nextInt();
		
		while(t>0)
		{
			int n=scn.nextInt();
			int a[]= new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=scn.nextInt();
			}
			quickSort(a,0,n-1);
			
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
			t--;
		}
	}
	
	public static void quickSort(int a[],int l,int h);
	{
		
		if(l>h)
			return;
		
		int pivot=a[h];
		
		int pi=partition(a,pivot);
		
		quickSort(a,l,pi-1);
		quickSort(a,pi+1,h);
	}
	
	public static int partition(int a[],int pivot)
	{
		int j=0;
		for(int i=0;i<a.length)
		{
			if(a[i]>pivot)
			{
				i++;
			}
			else
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
				i++;
			}
		}
		return(j-1);
	}
}