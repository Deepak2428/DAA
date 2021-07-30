
import java.util.*;
class duplicateKey
{
  public static void main(String args[])
  {
    Scanner scn= new Scanner(System.in);
    int t=scn.nextInt();              // no of test cases
    while(t>0){
    int n=scn.nextInt();
    int a[]= new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=scn.nextInt();
    }
    int key=scn.nextInt();
    int l=0;
    int u=n-1;
    int fi=0;
    int li=0;
    while(l<=u)
    {
      int mid= l+(u-l)/2;
      if(a[mid]==key)
      {
        fi=mid;
        u=mid-1;
      }
      else if(a[mid]<key)
      {
        l=mid+1;
      }
      else
      {
        u=mid-1;
      }
    }
    l=0;
    u=n-1;
    while(l<=u)
    {
      int mid= l+(u-l)/2;
      if(a[mid]==key)
      {
        li=mid;
        l=mid+1;
      }
      else if(a[mid]<key)
      {
        l=mid+1;
      }
      else
      {
        u=mid-1;
      }
    }
    if(fi==0||li==0)
    {
        System.out.println("NOT PRESENT");
    }
    else
    {
        System.out.print("\n PRESENT : "+(li-fi+1)+" TIMES");
    }
      t--;
    }
  }
}
