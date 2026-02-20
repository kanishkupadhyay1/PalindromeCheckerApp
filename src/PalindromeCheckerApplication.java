import java.util.*;

// Entry point
public class PalindromeCheckerApplication {

    public static boolean PalindromeCheckerTwoPointer(String Input){

        char[] chars=Input.toCharArray();
        int start=0;
        int end=Input.length()-1;

        while (start < end) {
            if(chars[start]!=chars[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System\nVersion : 1.0.00.0\nSystem Initialized Successfully.");

        //Uc 4 Two Pointer string method(Character Array)
        String Input=new String("radar");
        System.out.println("Input Text: "+Input);
        System.out.println("Is it Palindrome? : "+PalindromeCheckerTwoPointer(Input));

    }
}