

//Week1 ques 1


import java.util.*;
class LinearSearch
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int t=scn.nextInt();      // no of test cases
        while(t>0)              
        {
            int n=scn.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=scn.nextInt();
            }
            int key=scn.nextInt();
            int comparisons=0;
            int flag=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]==key)
                {
                    comparisons++;
                    System.out.println("Present "+comparisons);
                    flag=1;
                    break;
                }
                comparisons++;
            }
            if(flag==0)
            {
                System.out.println("Not Present "+comparisons);
            }
            t--;
        }
    }
}
