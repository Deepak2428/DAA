import java.util.*;
class pairDiff
{
  public static void main(String args[])
  {
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    for(int i=0;i<n;i++)
    {
      a[i]=scn.nextInt();
    }
    int key=scn.nextInt();
    int count=0;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(a[i]-a[j]==key)
        {
          count++;
        }
      }
    }
    System.out.println("\n"+ count);
  }
}
