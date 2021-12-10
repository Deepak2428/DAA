import java.util.*;
class TargetSum
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
            int tar=scn.nextInt();
            Arrays.sort(a);
            System.out.println("");
            int flag=0;
            for(int i=0,j=n-1;i<j;)
            {
                if(a[i]+a[j]==tar)
                {
                    System.out.print(a[i]+" "+a[j]+",");
                    i++;
                    j--;
                    flag=1;
                }
                else if(a[i]+a[j]<tar)
                {
                    i++;
                }
                else
                {
                    j--;
                }
            }
            
            if(flag==0)
            {
                System.out.println("No such pair exists");
            }
            t--;
        }
    }
}