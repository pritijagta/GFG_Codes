//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.extractMaximum(S)); 
            t--;
        }
    } 
} 



// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int extractMaximum(String S) 
    { 
        int maxi=-1;
        String s1="";
       for(int i=0;i<S.length();i++)
       {
           if(S.charAt(i)-'0'<=9)
           {
               s1+=S.charAt(i)-'0';
               
               if(Integer.parseInt(s1)>=maxi)
               {
                   maxi=Integer.parseInt(s1);
               }
           }
           else{
              s1="";
              
           }
       }
       return maxi;
    }    
} 
