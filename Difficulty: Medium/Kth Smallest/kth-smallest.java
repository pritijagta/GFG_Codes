//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends

class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        mergeSort(arr, l, r);
        return arr[k - 1]; // Since k is 1-based index
    }

    public static void mergeSort(int[] arr, int l, int r) {
       
       
       if(l<r)
       {
           int mid=(l+r)/2;
           mergeSort(arr,l,mid);
           mergeSort(arr,mid+1,r);
           merge(arr,l,mid,r);
       }
    }
    
    public static void merge(int [] arr,int l, int mid,int r)
    {
        int n1=mid-l+1;
        int n2=r-mid;
        
        int l1[]=new int[n1];
        int l2[]=new int[n2];
        
        
        for(int i=0;i<n1;i++)
        {
            l1[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++)
        {
            l2[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(l1[i]<=l2[j])
            {
                arr[k]=l1[i];
                k++;
                i++;
            }
            else{
                arr[k]=l2[j];
                k++;
                j++;
        }
        }
        
        while(i<n1)
        {
            arr[k]=l1[i];
            k++;i++;
        }
        while(j<n2)
        {
            arr[k]=l2[j];
            k++;j++;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("The " + k + "rd smallest element is " + kthSmallest(arr, 0, arr.length - 1, k));
    }
}
