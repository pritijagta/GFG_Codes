//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.encode(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String encode(String s) {
        int count=1;
        StringBuilder s1=new StringBuilder();
        int i;
        for( i=0;i<s.length()-1;i++)
        {
           
            if(s.charAt(i)==s.charAt(i+1))
            {
                
                count++;
                
            }
            else{
               
                s1.append(s.charAt(i));
                s1.append(count);
                count=1;
               
            }
            
        }
         s1.append(s.charAt(i));
        s1.append(count);
        return s1.toString();
    }
}
    