//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!(h.containsKey(arr[i])))
            {
                h.put(arr[i],1);
            }
            else{
                
                h.put(arr[i],h.get(arr[i])+1);
            }
        }
        
        
        for(Integer i : h.keySet())
        {
            int value=(int)h.get(i);
            
            
            if(value>(arr.length/2))
            {
                return (int)i;
            }
            
        }
        return -1;
    }
}