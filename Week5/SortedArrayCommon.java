import java.util.*;
class SortedArrayCommon
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int t=scn.nextInt();
        while(t>0)
        {
            int n=scn.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=scn.nextInt();
            }
            int m=scn.nextInt();
            int b[]= new int[m];
            for(int i=0;i<m;i++)
            {
                b[i]=scn.nextInt();
            }
            int i=0,j=0;
            for( i=0,j=0;i<n&&j<m;)
            {
                if(a[i]==b[j])
                {
                    System.out.print(a[i]+" ");
                    i++;
                    j++;
                }
                else if(a[i]<b[j])
                {
                    i++;
                }
                else
                {
                    j++;
                }
            }
            
            t--;
        }
    }
}