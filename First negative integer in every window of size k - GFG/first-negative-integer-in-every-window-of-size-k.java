// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        //brute force
        //TC : O(N^2)
        //SC : O(1)
        
        // long[] arr = new long[N-K+1];
        // int k = 0;
        // for(int i = 0; i < N-K+1 ; i++){
        //     for(int j = i; j<i+K;j++){
        //         if(A[j] < 0){
        //             arr[k] = A[j];
        //             break;
        //         }
        //         else{
        //             arr[k] = 0;
        //         }
        //     }
        //     k++;
        // }
        
        // return arr;
        
        //Using sliding window
        
        long[] arr = new long[N-K+1];
        List<Long> negArr = new ArrayList<Long>(K);
        
        int i =0, j=0,k=0;
        
        while(j < N){
            if(A[j] < 0){
                negArr.add(A[j]);
            }
            
            if(j-i+1 < K){
                j++;
            }
            else if(j-i+1 == K){
                if(negArr.size() > 0) arr[k] = negArr.get(0);
                else arr[k] = 0;
                
                if(A[i] < 0 ){
                    negArr.remove(A[i]);
                }
                i++;
                j++;
                k++;
            }
        }
        
        return arr;
    }
}