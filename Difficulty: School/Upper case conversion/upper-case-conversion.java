//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String transform(String s)
    
    {
        String s1[]=s.split(" ");
        StringBuilder s2=new StringBuilder(); 
        
        for(int i=0;i<s1.length;i++)
        {
            s2.append(s1[i].substring(0,1).toUpperCase()+s1[i].substring(1)+" ");
        }
        
        return s2.toString();
    }
}