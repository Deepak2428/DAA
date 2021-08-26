import java.util.*;
class TargetSum
{
    public static void quickSort(int a[],int lo,int hi)
    {
        if(lo>hi)
        {
            return;
        }
        int pivot=a[hi];
        int pi=partition(a,lo,hi,pivot);
        quickSort(a,lo,pi-1);
        quickSort(a,pi+1,hi);
    }
    public static int partition(int a[],int lo,int hi,int pivot)
    {
        int i=0,j=0;
        for(i=lo,j=lo;i<=hi;)
        {
            if(a[i]>pivot)
            {
                i++;
            }
            else if(a[i]<=pivot)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j++;
            }
        }
        return (j-1);
    }
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
            quickSort(a,0,n-1);
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
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