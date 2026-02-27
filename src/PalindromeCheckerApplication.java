import java.util.*;

class PalindromeChecker{
    //method to check palindrome in recursive way
    public static boolean PalindromeCheckRecursive(String Input,int start,int end){
        if(start>=end){ //base condition
            return true;
        }
        if(Input.charAt(start)!=Input.charAt(end)){
            return false;
        }
        return PalindromeCheckRecursive(Input,start+1,end-1);
    }

    //method to normalize the input
    public static String normalize(String Input){
        StringBuilder sb=new StringBuilder();

        for(char ch : Input.toCharArray()){
            if(ch!=' ') {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }

}
// Entry point
public class PalindromeCheckerApplication {




    //main method
    public static void main(String[] args){
        PalindromeChecker service=new PalindromeChecker();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Palindrome Checker Management System\nVersion : 1.0.00.0\nSystem Initialized Successfully.");

        //Uc 10  
        System.out.println("Enter the string");
        String Input=sc.nextLine();
        Input=new String(service.normalize(Input));

        System.out.println("Is it Palindrome? : "+service.PalindromeCheckRecursive(Input,0,Input.length()-1));
    }
}
