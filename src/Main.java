import java.util.*;

//Use case 1 Entry point
public class Main {
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

    public static boolean PalindromeCheckerReverseString(String Input){
        for(int count=Input.length()-1;count>=0;count--){
            if(Input.charAt(count)!=Input.charAt(Input.length()-count-1)){
                return false;
            }
        }
        return true;

    }

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

        //Uc 3 reverse string method
        System.out.println("Input Text: "+Input);
        System.out.println("Is it Palindrome? : "+PalindromeCheckerReverseString(Input));

        //Uc 4 Two Pointer string method
        Input=new String("radar");
        System.out.println("Input Text: "+Input);
        System.out.println("Is it Palindrome? : "+PalindromeCheckerReverseString(Input));

        //Uc 5 Stack string method
        Input=new String("noon");
        System.out.println("Input Text: "+Input);
        System.out.println("Is it Palindrome? : "+PalindromeCheckerStack(Input));

        //Uc 6 Stack Queue string method
        Input=new String("civic");
        System.out.println("Input Text: "+Input);
        System.out.println("Is it Palindrome? : "+PalindromeCheckerStackQueue(Input));

        //Uc 6  Deque string method
        Input=new String("refer");
        System.out.println("Input Text: "+Input);
        System.out.println("Is it Palindrome? : "+PalindromeCheckerDeuqe(Input));
    }
}