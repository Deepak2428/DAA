import java.util.*;
class BinarySearch
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int t=scn.nextInt();
        while(t>0)
        {
            int n=scn.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=scn.nextInt();
            }
            int key=scn.nextInt();
            int low=0;
            int high=n-1;
            int flag=0;
            int comparisions=0;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(a[mid]==key)
                {
                    comparisions++;
                    System.out.println("Present "+comparisions);
                    flag=1;
                    break;
                }
                else if(a[mid]<key)
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
                comparisions++;
            }
            if(flag==0)
            {
                System.out.println("Not Present "+comparisions);
            }
            t--;
        }
    }
}