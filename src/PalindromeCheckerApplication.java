import java.util.*;



// Entry point
public class PalindromeCheckerApplication {



    //method to check palindrome in recursive way
    public static boolean PalindromeCheckRecursive(String Input,int start,int end){
        if(start>=end){
            return true;
        }
        if(Input.charAt(start)!=Input.charAt(end)){
            return false;
        }
       return PalindromeCheckRecursive(Input,start+1,end-1);
    }

    //main method
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System\nVersion : 1.0.00.0\nSystem Initialized Successfully.");

        //Uc 7  Deque string method
        String Input=new String("madam");
        System.out.println("Input Text: "+Input);
        System.out.println("Is it Palindrome? : "+PalindromeCheckRecursive(Input,0,Input.length()-1));
    }
}