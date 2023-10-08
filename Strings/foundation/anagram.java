//Problem: Given two strings, check whether two strings are an anagram of each other. Two strings are said to be an anagram of each other if they are just permutations of each other. That is, the set of characters in both the strings must be the same, only the order of characters can be different.



import java.util.Scanner;

public class anagram {

    public static boolean isAnagram(String a, String b){

        int x = 0;

        for(int i=0; i<a.length(); i++){
           x = x^(a.charAt(i));
           x = x^(b.charAt(i)); 
        }

        if(x!=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(isAnagram(a, b));
    }
}
