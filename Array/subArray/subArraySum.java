// print sum of every subarray
import java.util.*;

public class subArraySum{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum = sum + arr[k];
                }
                System.out.println(sum);
            }
            System.out.println();
        }
    }
}