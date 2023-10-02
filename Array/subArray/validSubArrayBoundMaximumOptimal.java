/*
leetcode 795
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

/*
solution
arr[10] = {9,6,8,7,5,4,1,10,6,8} l=6 r=8
three cases are there

case 1: arr[ep] > r
let 10 is end point
valid starting point = 0 beacuse 10 is greater than r that is 8 so no subarray include.

case 2: arr[ep]>= l && arr[ep]<=r
let 7 is end point, this number itself is in the range
previous number that is 8 also in range is also a valid starting point
the range could be to that previous till the number greater than right
valid starting point = [lgei, ep]-> last greater that right elements index + 1;
for 7, lgei could be 6 because last greater is 9 so last greater + 1 is 6 (in terms of elements)
total count = ep-lgei+1;

case 3: arr[ep]<l
lets take elements 1
the valid starting points => number of valid starting
                             points for the elements
                             int the range of [l,r]
                             just before the curret 
                             elements
for 1 valid starting point is 6
(we want maximum in range subarray)


//Pseudo code

int validsubarray(arr[n], int left, int right){
    int ans = 0;
    int lgei = 0;
    int preValidCount = 0;
    
    for(int ep=0; ep<n; ep++){
        if(arr[ep]>right){
           ans = ans + 0;
           lgei = ep + 1;
           preValidCount = 0;
        }else if(arr[ep]>=left && arr[ep]<=right){
            ans = ans + (ep-lgei+1);
            preValidCount = ep-lgei+1;
        }else{  //(arr[ep]<left)
            ans = ans + preValidCount;
        }   
    }
    
    return ans;
}

*/

import java.util.Scanner;

public class Main {
    public static int validSubArray(int arr[], int n, int left, int right){
        int ans = 0;
        int lgei = 0;
        int preValidCount = 0;
    
        for(int ep=0; ep<n; ep++){
            if(arr[ep]>right){
               ans = ans + 0;
               lgei = ep + 1;
               preValidCount = 0;
            }else if(arr[ep]>=left && arr[ep]<=right){
                ans = ans + (ep-lgei+1);
                preValidCount = ep-lgei+1;
            }else{  //(arr[ep]<left)
                ans = ans + preValidCount;
            }   
        }
    
        return ans;
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
        
                System.out.println(validSubArray(arr,n,left,right));
    }
}