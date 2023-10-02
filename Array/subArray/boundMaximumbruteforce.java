/*
Number of subarrays with bounded maximum
given arr[n] and two integers left and right. Return the number of subarrays such that value of maximum array elements in that subarray is in the range {left, right}.

ex1: arr[4] = {2,1,4,3}; left=2 right=3
 we need to count the valid sub array
 all subarray 
 2   //valid  1       4     3 //valid
 2 1 //valid  1 4     4 3
 2 1 4        1 4 3
 2 1 4 3
 total valid sub array 3
 how-> maximum of subarray (like 2 1 max is 2) is in the range >=2 and <=3
*/
// brute force

import java.util.Scanner;

public class Main {
    public static int boundMax(int arr[], int n, int left, int right){
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int max = Integer.MIN_VALUE;
                for(int k=i; k<=j; k++){
                    if(arr[k]>max){
                        max = arr[k];
                    }
                }
                if(max>=left && max<=right){
                    count++;
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int left = sc.nextInt();
        int right = sc.nextInt();
        
                System.out.println(boundMax(arr,n,left,right));
    }
}