//sum of sub array with prefix sum time complexity n^2

import java.util.Scanner;

public class subArraySumWithPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int pf[] = new int[n];
        pf[0] = arr[0];
        for(int i=1; i<n; i++){
            pf[i] = pf[i-1] + arr[i];
        }
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(i==0){
                    System.out.print(pf[j]);
                }else{
                    System.out.print(pf[j]-pf[i-1]);
                }
                System.out.println();
            }
             System.out.println();
        }
    }
}
