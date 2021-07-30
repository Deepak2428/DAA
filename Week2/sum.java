import java.util.scanner*;
class sum
{
  public static void main(String args[])
  {
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    int a[]= new int [n];
    for(int i=0;i<n;i++)
    {
      a[i]=scn.nextInt();
    }
    for(int i=0;i,n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        for(int k=j+1;k<n;k++)
        {
          if(a[i]+a[j]==a[k])
          {
            System.out.print("\n"+ i,j,k);
          }
        }
      }
    }
  }
}
          
