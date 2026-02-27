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

class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String input) {  // check palindrome
        return strategy.isPalindrome(input);
    }

    public static String normalize(String input) {
        StringBuilder sb = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
}

public class PalindromeCheckerApplication {

    //main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Palindrome Checker Management System\nVersion : 1.0.00.0\nSystem Initialized Successfully.");

        //Uc 12  Strategy based Palindrome Check
        System.out.println("Choose Strategy:");
        System.out.println("1. Stack");
        System.out.println("2. Deque");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the string");
        String input = sc.nextLine();
        input = PalindromeChecker.normalize(input);

        PalindromeStrategy strategy;

        switch (choice) {   //i used menue for stratagy type
            case 1:
                strategy = new StackStrategy();
                break;
            case 2:
                strategy = new DequeStrategy();
                break;
            default:
                System.out.println("Invalid choice. Using Stack strategy.");
                strategy = new StackStrategy();
        }

        //inject strategy at runtime
        PalindromeChecker checker = new PalindromeChecker(strategy);

        System.out.println("Is it Palindrome? : " + checker.check(input));


    }
}