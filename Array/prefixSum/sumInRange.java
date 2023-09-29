/*problem statement => Given N array elements and Q queries for each query calculate sum of all elements in given range.
*/
//leetcode : 303

import java.util.*;

public class sumInRange{
    
    public static void prefix(int arr[], int queries[][]){
        int pf[] = new int[arr.length];
        pf[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            pf[i] = pf[i-1] + arr[i];
        }
        
        for(int i=0; i<queries.length; i++){
            if(queries[i][0]==0){
                System.out.println(pf[queries[i][1]]);
            }else{
            System.out.println(pf[queries[i][1]]-pf[queries[i][0]-1]);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int queries[][] = new int[q][2];
        for(int i=0; i<q; i++){
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }
        
        prefix(arr,queries); 
    }
}