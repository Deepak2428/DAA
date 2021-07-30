
import java.util.*;
class duplicateKey
{
  public static void main(String args[])
  {
    Scanner scn= new Scanner(System.in);
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
    while(l<=u)
    {
      int mid= l+(u-l)/2;
      if(a[mid]==key)
      {
        fi=mid-1;
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
    System.out.println(fi);
  }
}
