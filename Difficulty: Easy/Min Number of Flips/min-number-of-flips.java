//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution ob = new Solution();
            
            System.out.println(ob.minFlips(S));
                        
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    public int minFlips(String S) {
        
        int c0=0;
        int c1=0;
        
        for(int i=0;i<S.length();i++)
        {
            if(i%2==0 && S.charAt(i)!='0')
            {
                c0++;
            }
            if(i%2!=0 && S.charAt(i)!='1')
            {
                c0++;
            }
        }
          for(int i=0;i<S.length();i++)
        {
            if(i%2==0 && S.charAt(i)!='1')
            {
                c1++;
            }
            if(i%2!=0 && S.charAt(i)!='0')
            {
                c1++;
            }
        }
        return Math.min(c0,c1);
    }
    
}