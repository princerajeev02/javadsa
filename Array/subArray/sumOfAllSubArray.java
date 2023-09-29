import java.util.Scanner;

public class sumOfAllSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //calculate prefix sum;
        
        int pf[] = new int[n];
        pf[0] = arr[0];
        for(int i=1; i<n; i++){
            pf[i] = pf[i-1] + arr[i];
        }
        
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(i==0){
                    sum = sum + pf[j];
                }else{
                    sum = sum + pf[j]-pf[i-1];
                }
            }
        }
        
        System.out.println(sum);
    }
}
