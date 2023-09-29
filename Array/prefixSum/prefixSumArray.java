//leetcode: 1480 print prefix sum;
import java.util.*;

public class prefixSumArray{

    public static void prefixSum(int arr[], int n){
        int pf[] = new int[n];

        pf[0] = arr[0];
        for(int i=1; i<n; i++){
            pf[i] = pf[i-1] + arr[i];
        }

        for(int i=0; i<n; i++){
            System.out.print(pf[i]+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        prefixSum(arr,n);
    }
}