import java.util.*;
import java.io.*;
class MaxPairwiseProduct {
	public static void main (String[] args) throws Exception {
     Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         long a[]=new long[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextLong();
         }
         Arrays.sort(a);
         System.out.println(a[n-1]*a[n-2]);
	}
}