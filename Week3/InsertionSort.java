import java.util.*;
class insertionSort
{
	public static void main(String args[])
	{
		Scanner scn= new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0){
		int n=scn.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scn.nextInt();
		}
		int key=a[0];
		int comparisions=0;
		int shifts=0;
		for(int i=1;i<n;i++)
		{
			comparisions++;
			if(a[i]<key)
			{
				key=a[i];
				for(int j=i-1;j>=0 && a[j]>key;j--)
				{
					comparisions++;
					shifts++;
					int temp=a[j];
					a[j]=key;
					a[j+1]=temp;
				}
				key=a[i];
			}
		}
		System.out.println("\n Comparisions = "+comparisions+"\n Shifts = "+shifts);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		t--;
		}
	}
}