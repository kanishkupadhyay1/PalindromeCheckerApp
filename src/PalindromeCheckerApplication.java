import java.util.*;

//Use case 1 Entry point
public class PalindromeCheckerApplication {

    public static boolean palindromeChecker(String input){
        for(int count=0;count<input.length()/2;count++){
            if(input.charAt(count)!=input.charAt(input.length()-count-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System\nVersion : 1.0.00.0\nSystem Initialized Successfully.");

        //hardcoded string to check UC2
        String Input=new String("madam");
        System.out.println("Input Text: "+Input);
        System.out.println("Is it Palindrome? : "+palindromeChecker(Input));

    }
}