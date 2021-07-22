//      DAA Assignmnent to implement linear search

//      Language :-  JAVA



    import java.io.*;
	import java.util.*;
	class linear_search
	{
		public static void main(String args[])
		{
			Scanner scn= new Scanner(System.in);
			
			int t=0;            // no of test cases
			t=scn.nextInt();
			while(t>0)
			{
				int n=scn.nextInt();
				int a[]= new int[n];
				for(int i=0;i<n;i++)
				{
					a[i]=scn.nextInt();
				}
				int key=scn.nextInt();              // elements to be searched
				int flag=0;
				for(int i=0;i<n;i++)
				{
					if(a[i]==key)
					{
						System.out.println(" Present at index "+i);
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println(" Not Present " );
				}
				t--;
			}
		}
	}
