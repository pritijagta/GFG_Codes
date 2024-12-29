//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int[] ans = new int[n];
            ans = ob.productExceptSelf(arr);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            System.out.println("~");
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        
        int result[]=new int[arr.length];
        
        int temp=1;
        int count0=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count0++;
            }
            else{
            temp*=arr[i];
            }
        }
        
        if(count0==0)
        {
        
        for(int i=0;i<arr.length;i++)
        {
            result[i]=temp/arr[i];
        }
        }
        
        else{
            
            if(count0==1)
            {
               for(int i=0;i<arr.length;i++)
              {
                if(arr[i]==0)
                {
                    result[i]=temp;
                }
                else{
                    result[i]=0;
                }
            }
            }
            else{
                
                for(int i=0;i<arr.length;i++)
              {
                result[i]=0;
             }
            }
        }
      return result;
        }
        
        
        
        
        
    
}
