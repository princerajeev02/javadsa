//leetcode: 724 finding equilibrium index or pivot index;
import java.util.*;

public class equilbriumIndex{

    public static int pivotIndex(int arr[]){
        int n = arr.length;
        int pf[] = new int[n];
        pf[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            pf[i] = pf[i-1] + arr[i];
        }
        if((pf[n-1]-pf[0])==0){
            return 0;
        }
            
        for(int i=1; i<n-1; i++){
            int leftSum = pf[i-1];
            int rightSum = pf[n-1]-pf[i];
            if(leftSum == rightSum){
                return i;
            }
        }

        if(pf[n-2]==0){
            return n-1;
        }

        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
   
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(pivotIndex(arr));
        
    }
}