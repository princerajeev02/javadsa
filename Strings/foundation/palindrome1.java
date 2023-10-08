import java.util.*;

import java.util.Scanner;

public class palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(s);
        String sb1 = sb.reverse().toString();
        
        System.out.println(s.equalsIgnoreCase(sb1));
        
    }
}
