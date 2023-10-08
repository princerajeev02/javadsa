//if binary is given in form of number

import java.util.Scanner;

// public class binaryToDecimal {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int i = 0;
//         int sum = 0;
//         while(n>0){
//             int mod = n%10;
//             sum = sum + (int)(mod*Math.pow(2,i));
//             n = n/10;
//             i++;
//         }

//         System.out.println(sum);
//     }
// }

// if binary is given in form of String

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int index = 0;
        int sum = 0;

        for(int i=s.length()-1; i>=0; i--){
            int num = s.charAt(i)-48;

            sum = sum + (int)(num*Math.pow(2,index));
            index++;
        }

        System.out.println(sum);
    }
}