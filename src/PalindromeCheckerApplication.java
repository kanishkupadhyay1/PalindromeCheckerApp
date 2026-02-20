import java.util.*;

// Entry point
public class PalindromeCheckerApplication {

    public static boolean PalindromeCheckerReverseString(String Input){
        for(int count=Input.length()-1;count>=0;count--){
            if(Input.charAt(count)!=Input.charAt(Input.length()-count-1)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System\nVersion : 1.0.00.0\nSystem Initialized Successfully.");

        //Uc 3 reverse string method
        String Input=new String("madam");
        System.out.println("Input Text: "+Input);
        System.out.println("Is it Palindrome? : "+PalindromeCheckerReverseString(Input));


    }
}