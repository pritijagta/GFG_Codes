//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPanagram(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPanagram(String S) {
        ArrayList<Character>l=new ArrayList<>();
       S=S.toLowerCase();
       int count=0;
        for(int i=0;i<S.length();i++)
        {
            if(!(S.charAt(i)>='a' && S.charAt(i)<='z'))
            {
                continue;
            }
            else{
                if(!(l.contains(S.charAt(i))))
                {
                l.add(S.charAt(i));
                count++;
                }
            }
        }
        if(count==26)
        {
            return 1;
        }
        return 0;
    }
};