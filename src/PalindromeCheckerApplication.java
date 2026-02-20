import java.util.*;

// Entry point
public class PalindromeCheckerApplication {

    public static boolean PalindromeCheckerStack(String Input){
        Stack<Character> ReversedInput=new Stack<>();
        for(char c: Input.toCharArray()){
            ReversedInput.push(c);
        }
        for(char c: Input.toCharArray()){
            if(c!=ReversedInput.pop()){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System\nVersion : 1.0.00.0\nSystem Initialized Successfully.");

        //Uc 5 Stack string method
        String Input=new String("noon");
        System.out.println("Input Text: "+Input);
        System.out.println("Is it Palindrome? : "+PalindromeCheckerStack(Input));
    }
}