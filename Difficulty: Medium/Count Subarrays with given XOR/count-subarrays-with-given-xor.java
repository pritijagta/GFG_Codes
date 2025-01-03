//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String s[] = br.readLine().split(" ");
            int arr[] = new int[s.length];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int k = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            System.out.println(obj.subarrayXor(arr, k));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public long subarrayXor(int arr[], int k) {
        
        HashMap<Integer,Integer>h=new HashMap<>();
        int prefix_xor=0;
        int current_xor=0;
        long count=0;
        for(int i=0;i<arr.length;i++)
        {
            current_xor^=arr[i];
            prefix_xor=current_xor^k;
            
            if(current_xor==k)
            {
                count++;
            }
            
            if(h.containsKey(prefix_xor))
            {
                count+=h.getOrDefault(prefix_xor,0);
            }
            
            h.put(current_xor,h.getOrDefault(current_xor,0)+1);
        }
        return count;
    }
}