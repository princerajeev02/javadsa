// sum of all sub array 
//by contribution technique
/*
 ex: arr = {1,2,3,4}
 so the sum should be no of occurance * elements like
 1          2        3      4
 1 2        2 3      3 4
 1 2 3      2 3 4    
 1 2 3 4
 
 in this all subarray
 (1*4) + (2*6) + (3*6) + (4*1)
 arr[0]*no of occurance of 1 and so on
 ----------now we have to find occurance of each elements and multiply it to same elements--------
 => finding occurance
  let's take a array 
  arr = {3,-2,4,-1,2,6}
  let's find occurance for index 3(arr[3]=-1)
  
  we have to find all valid starting point and valid end points index
  s->valid starting point index
  e->valid end point index
  for index 3, if we start from 0,1,2,3 we can consider it as valid point because if we start from 0,1,2,3 we can include 3 but we start from 3 or 4 we cannot include 3
  for index 3, if we end 3,4,5 we can consider it as valid end point because if we end at 3,4,5 we can include 3 but if we end at 0,1,2 we cannot include 3
  
  s     e
  0     3
  1     4
  2     5
  3
         total subarray are (4*3)=12
         no of valid starting point*no of end point
 so all sub array could be
 (0-3)(0-4)(0-5)
 (1-3)(1-4)(1-5)    //start from 1 and end at 3
 (2-3)(2-4)(2-5)
 (3-3)(3-4)(3-5)
 these 12 sub array 
 
 we can generalize in this way
  for ith index
no of occurance = (no. of valid s)*(no. of valid e)
                  (0-ith)          (ith-(n-1))
        n  count  (i+1)            (n-1-i+1) = (n-i)
        
 total no of occurance = (i+1)*(n-i)
 
 ===>>> elements*total no. of occurance
 
 pseduo code
 int totalSum(int arr[n]){
 int ans = 0;
 for(int i=0; i<n; i++){
 ans = ans + (arr[i]*((i+1)*(n-i)));
 }
 return ans;
 }
 
 -----> TC: O(N)
        SC: O(1)
*/

import java.util.Scanner;

public class Main {
    
    public static int totalSum(int arr[], int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            int occur = (i+1)*(n-i);
            sum = sum + (arr[i]*occur);
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(totalSum(arr,n));
    }
}