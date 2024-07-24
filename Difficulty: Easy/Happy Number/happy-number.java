//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
    
    public static int numsq(int n)
    {
        int num=n;
        int sum=0;
        while(num!=0)
        {
            int rem=num%10;
            num=num/10;
            sum=sum+(rem*rem);
            
        }
        return sum;
    }
  
     static int isHappy(int n) { 
         
         ArrayList<Integer>l=new ArrayList<>();
         while(true)
         {
              n=numsq(n);
            if(n==1)
             return 1;
             
             if(l.contains(n))
             return 0;
             
             l.add(n);
         }
         
       //  return 0;
     }
}