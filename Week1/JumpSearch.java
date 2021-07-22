import java.util.*;
class JumpSearch
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
        int key=scn.nextInt();
        int comparisions=0;
        int flag=0;
        int jump=(int)Math.sqrt(n);
        for(int i=0;i<n&&i+jump<n;i=i+jump)
        {
            if(a[i]==key)
            {
                comparisions++;
                System.out.println("Present "+comparisions+1);
                flag=1;
                break;
            }
            else if(key>a[i]&&key<=a[i+jump])
            {
                for(int j=i+1;j<=i+jump;j++)
                {
                    if(a[j]==key)
                    {
                        comparisions++;
                        System.out.println("Present "+comparisions+1);
                        flag=1;
                        break;
                    }
                    comparisions++;
                }
            }
            if(flag==1)
            {
                break;
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