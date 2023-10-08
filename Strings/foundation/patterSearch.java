import java.util.Scanner;

public class patterSearch {

    public static void searchPatter(String txt, String pat){

        int index = txt.indexOf(pat);

        while(index>=0){
            System.out.println(index);
            index = txt.indexOf(pat,index+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String pattern = sc.nextLine();

        searchPatter(text, pattern);
    }
}
