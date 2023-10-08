import java.io.*;
import java.util.*;

public class palindrome{
    
    public static boolean isPalindrome(String s){
        int sp = 0;
        int ep = s.length()-1;
        s = s.toUpperCase();
        
        while(sp<ep){
            if(s.charAt(sp)!=(s.charAt(ep))){
                return false;
            }
            sp++;
            ep--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.println(isPalindrome(s));
        
    }
}