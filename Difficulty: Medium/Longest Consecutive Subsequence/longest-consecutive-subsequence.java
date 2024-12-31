//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // Read first array
            String input = br.readLine();
            String[] inputArray = input.split(" ");
            int[] arr = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

            Solution ob = new Solution();
            int res = ob.longestConsecutive(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        
        Arrays.sort(arr);
        
        int maxcount=1;
        int count=1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]==arr[i])
            {
                continue;
            }
           else if(arr[i+1]==arr[i]+1)
            {
                count++;
                maxcount=Math.max(maxcount,count);
            }
            else{
                count=1;
            }
        }
        return maxcount;
        
    }
}