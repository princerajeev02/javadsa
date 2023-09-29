//leetcode: 42 Rain water Trapping problem;
import java.util.*;

public class rainWaterTrapping{

    public static int trap(int height[], int n){
        int count = 0;
        int left[] = new int[n];
        int right[] = new int[n];
        
        left[0] = height[0];
        right[n-1] = height[n-1];

        for(int i=1; i<n; i++){
            if(height[i]>left[i-1]){
                left[i] = height[i];
            }else{
                left[i] = left[i-1];
            }
        }

        for(int i=n-2; i>=0; i--){
            if(height[i]>right[i+1]){
                right[i] = height[i];
            }else{
                right[i] = right[i+1];
            }
        }

        for(int i=0; i<n; i++){
            count = count + (Math.min(left[i],right[i]))-height[i];
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

        System.out.println(trap(arr,n));
    }
}