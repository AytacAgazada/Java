package Lesson;
import java.util.Scanner;
public class ValidPalindrome {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String s = scn.nextLine().trim();
        System.out.println(isPalindrome(s));


    }
    public static boolean isPalindrome(String s) {

        String check = "";
        for(int i = 0; i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                check += s.charAt(i);
            }
        }
        check = check.toLowerCase();
        int x = check.length()-1;
        for(int i = 0; i<x; i++){
            if(check.charAt(i)!=check.charAt(x)){
                return false;
            }
            x--;
        }
        return true;

    }
}
