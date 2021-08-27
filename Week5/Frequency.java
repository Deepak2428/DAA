import java.util.*;
class Frequency
{
	public static void main(String args[])
	{
		Scanner scn= new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0)
		{
			int n=scn.nextInt();
			char a[]= new char[n];
			for(int i=0;i<n;i++)
			{
				a[i]=scn.next().charAt(0);
			}
			
			int freq[]=new int[26];
			for(int i=0;i<n;i++)
			{
				int idx=a[i]-97;
				freq[idx]++;
			}
			int max=freq[0];
			char c='a';
			for(int i=0;i<26;i++)
			{
				if(freq[i]>max)
				{
					max=freq[i];
					c=(char)(97+i);
				}
			}
			if(max!=1)
			{
				System.out.print("\n"+c+" -> "+max);
			}
			else
			{
				System.out.print("\n NO DUPLICATES PRESENT");
			}
			t--;
		}
	}
}