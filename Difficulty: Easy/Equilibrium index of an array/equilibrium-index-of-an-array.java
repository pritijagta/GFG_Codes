//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
class Solution {
    int findEquilibrium(int[] arr) {
     
     int sum=0;
     int sum1=0;
     for(int i=arr.length-1;i>=0;i--)
     {
         sum+=arr[i];
         
     }
     
     
     for(int j=0;j<arr.length;j++)
     {
         
         int result=sum-sum1-arr[j];
         if(sum1==result)
         {
            return j;
         }
         else{
             sum1+=arr[j];
         }
        
     }
     return -1;
     
     
     
     
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.findEquilibrium(arr);

            System.out.println(res);

            // System.out.println("~");
        }
    }
}

// } Driver Code Ends