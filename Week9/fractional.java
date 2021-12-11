import java.io.*;
import java.util.*;

public class fractional {
    
    static class Pair implements Comparable<Pair>
    {
        int val;
        int wt;
        double vbyw;
        Pair(int val,int wt,double vbyw)
        {
            this.val=val;
            this.wt=wt;
            this.vbyw=vbyw;
        }
        public  int compareTo(Pair o)
        {
           if(this.vbyw==o.vbyw)
           {
               return 0;
           }
           else if(this.vbyw>o.vbyw)
           {
               return +1;
           }
           else
           {
               return -1;
           }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int values[]= new int[n];
        int weights[]= new int[n];
        
        for(int i=0;i<n;i++)
        {
            values[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            weights[i]=scn.nextInt();
        }
        int cap= scn.nextInt();
        PriorityQueue<Pair> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            pq.add(new Pair(values[i],weights[i],(values[i]*1.0)/weights[i]));
        }
        double max=0;
        int leftcap=cap;
        while(pq.size()>0&&leftcap>0)
        {
            Pair rem= pq.remove();
            if(rem.wt<=leftcap)
            {
                max=max+rem.val;
                leftcap=leftcap-rem.wt;
            }
            else
            {
                max=max+ (rem.vbyw*leftcap);
            }
        }
        
        
        System.out.println(max);
        
        
    }
}