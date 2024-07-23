//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            

            Solution ob = new Solution();
            
            System.out.println(ob.lookandsay(n));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String lookandsay(int n) {
         if (n <= 0) return ""; 

        String s = "1"; 
        for (int i = 1; i < n; i++) {
            StringBuilder s1 = new StringBuilder();
            int count = 1;
            for (int j = 0; j < s.length(); j++) {
                
                while (j + 1 < s.length() && s.charAt(j) == s.charAt(j + 1)) {
                    count++;
                    j++;
                }
                
                s1.append(count);
                s1.append(s.charAt(j));
                count = 1; 
            }
            s = s1.toString(); 
        }
        return s;
    }
}
