import java.util.*;

// Entry point
public class PalindromeCheckerApplication {

    public static boolean PalindromeCheckerStackQueue(String Input){
        Stack<Character> ReversedInput=new Stack<>();
        Queue<Character> queue=new LinkedList<>();
        for(char c: Input.toCharArray()){
            ReversedInput.push(c);
            queue.add(c);
        }
        while(!queue.isEmpty()){
            if(queue.poll()!=ReversedInput.pop()){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System\nVersion : 1.0.00.0\nSystem Initialized Successfully.");

        //Uc 6 Stack Queue string method
        String Input=new String("civic");
        System.out.println("Input Text: "+Input);
        System.out.println("Is it Palindrome? : "+PalindromeCheckerStackQueue(Input));
    }
}