import java.util.*;

// Entry point
public class PalindromeCheckerApplication {

    public static boolean PalindromeCheckerDeuqe(String Input){
        Deque<Character> deque=new ArrayDeque<>();
        for(char c: Input.toCharArray()){
            deque.add(c);
        }
        while(deque.size()>1){
            if(deque.removeFirst()!=deque.removeLast()){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System\nVersion : 1.0.00.0\nSystem Initialized Successfully.");

        //Uc 7  Deque string method
        String Input=new String("refer");
        System.out.println("Input Text: "+Input);
        System.out.println("Is it Palindrome? : "+PalindromeCheckerDeuqe(Input));
    }
}