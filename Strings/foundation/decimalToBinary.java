import java.util.Scanner;

public class decimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder("");

        while(n>0){
            int mod = n%2;
            sb.insert(0,mod);

            n = n/2;
        }

        System.out.println(sb);
    }
}
