import java.util.*;
class SelectionSort
{
    public static void swap(int a[],int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]= temp;
    }
    
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int t= scn.nextInt();
        while(t>0){
        
        int n= scn.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        int swaps=0;
        int comparisions=0;
        for(int i=0;i<n-1;i++)
        {
            int index=i;
            for(int j=i+1;j<n;j++)
            {
                comparisions++;
                if(a[j]<a[i])
                {
                    index=j;
                }
            }
            swaps++;
            swap(a,i,index);
        }
        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.print("\n Swaps: "+swaps+"\n  Comparisions : "+comparisions);
        t--;
    }
    }
}
