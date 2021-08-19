import java.util.*;
class MergeSort
{
	public static void main(String args[])
	{
		Scanner scn= new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0)
		{
			int n=scn.nextInt();
			int a[]= new int [n];
			for(int i=0;i<n;i++)
			{
				a[i]=scn.nextInt();
			}
			
			int arr[]=mergeSort(a,0,n-1);
			
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]+" ");
			}
			t--;
		}
	}
	public static int[]  mergeSort(int a[],int l,int h)
	{
		
		if(l==h)
		{
			int ans[]= new int[1];
			ans[0]=a[l];
			return ans;
		}
		int mid=(l+h)/2;
		int b[]=mergeSort(a,l,mid);
		int c[]=mergeSort(a,mid+1,h);
		
		int arr[]=MergeSorted(b,c);
		
		return arr;
	}
	
	public static int[] MergeSorted(int a[],int b[])
	{
		int i=0,j=0,k=0;
		int ans[]= new int[a.length+b.length];
		for(i=0,j=0,k=0;i<a.length&&j<b.length;)
		{
			if(a[i]<=b[j])
			{
				ans[k]=a[i];
				i++;
				k++;
			}
			else
			{
				ans[k]=b[j];
				k++;
				j++;
			}
		}
		if(i==a.length)
		{
			for(;j<b.length;j++)
			{
				ans[k]=b[j];
				k++;
			}
		}
		else{
			for(;i<a.length;i++)
			{
				ans[k]=a[i];
				k++;
			}
		}
		return ans;
		}
}
			
			
			
			
			
			