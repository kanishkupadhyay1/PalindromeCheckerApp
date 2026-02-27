import java.util.*;

interface PalindromeStrategy {  //interface
    boolean isPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy {  //stack one

    @Override
    public boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {  //deque one

    @Override
    public boolean isPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

class RecursiveStrategy implements PalindromeStrategy {  //recursive one

    @Override
    public boolean isPalindrome(String input) {
        return check(input, 0, input.length() - 1);
    }

    private boolean check(String input, int start, int end) {
        if (start >= end) {   //base condition
            return true;
        }
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }
        return check(input, start + 1, end - 1);
    }
}

public class PalindromeCheckerApplication {

    //method to normalize input
    public static String normalize(String input) {
        StringBuilder sb = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }

    //main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("UC13 : Performance Comparison\n");

        System.out.println("Enter the string:");
        String input = sc.nextLine();
        input = normalize(input);


        PalindromeStrategy stack = new StackStrategy();
        PalindromeStrategy deque = new DequeStrategy();
        PalindromeStrategy recursive = new RecursiveStrategy();

        //stack timing
        long start1 = System.nanoTime();
        boolean result1 = stack.isPalindrome(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        //deque timing
        long start2 = System.nanoTime();
        boolean result2 = deque.isPalindrome(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        //recursive timing
        long start3 = System.nanoTime();
        boolean result3 = recursive.isPalindrome(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        //resuults
        System.out.println("\nResults:");
        System.out.println("Stack Result : " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Deque Result : " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Recursive Result : " + result3 + " | Time: " + time3 + " ns");


    }
}