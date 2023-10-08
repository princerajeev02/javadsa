/*Problem : Two strings are given of lengths n and n+1. The second string contains all the characters of the first string, but there is one extra character. The task is to find the extra character in the second string.
*/

//Brute force Approach : check every character

import java.util.Arrays;
import java.util.Scanner;

// public class extraCharacter {

//     public static char extra(String a, String b){
//         char ch[] = a.toCharArray();
//         char ch1[] = b.toCharArray();
        
//         Arrays.sort(ch);
//         Arrays.sort(ch1);
        
//         for(int i=0; i<a.length(); i++){
//             if(ch[i]!=ch1[i]){
//                 return ch1[i];
//             }
//         }
//         return ch1[ch1.length-1];
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.nextLine();
//         String b = sc.nextLine();
        
//         System.out.println(extra(a,b));
//     }
// }

// Better Approach - input every charcter in array and increment and decrement as they found at every index


// public class extraCharacter {

//     public static char value(String a, String b){
//         int arr[] = new int[26];
        
//         for(int i=0; i<a.length(); i++){
//             arr[b.charAt(i)- 'a']++;
//             arr[a.charAt(i)-'a']--;
//         }
//         arr[b.charAt(b.length()-1)- 'a']++;
        
//         for(int i=0; i<26; i++){
//             if(arr[i]==1){
//                 return (char)(i+'a');
//             }
//         }
//         return 0;
        
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.nextLine();
//         String b = sc.nextLine();
        
        
//         System.out.println(value(a,b));
//     }
// }

// Optimal approach : Use XOR operation if two same found then XOR make it 0 and if different found then make it that 0^x = x

public class extraCharacter {

    public static char findExtra1(String a, String b){
        int x = 0;
       for(int i=0; i<a.length(); i++){
           x = x^a.charAt(i);
           x = x^b.charAt(i);
       }
       x = x^b.charAt(b.length()-1);
       
       return (char)(x);
   }
   
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String a = sc.nextLine();
       String b = sc.nextLine();
       
       
       System.out.println(findExtra1(a,b));
   }
}
