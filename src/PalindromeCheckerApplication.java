import java.util.*;

 class ListNode{
int value;
ListNode next;
public ListNode(int val){
    this.value=val;
}
}

// Entry point
public class PalindromeCheckerApplication {

    public static boolean PalindromeCheckerLinkedList(String Input){
        ListNode head1=convert(Input);
        ListNode curr=head1;
        ListNode fast=curr,slow=curr;

        while(fast!=null && fast.next!=null){   // use slow and fast pointer to find center
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;

        head2= Reverse(head2); //reversed ll

        ListNode ptr1=head1,ptr2=head2;

        while(ptr1!=null && ptr2!=null){
            if(ptr1.value!=ptr2.value){
                return false;
            }
            ptr2=ptr2.next;
            ptr1=ptr1.next;
        }

        return true;
    }
    //method to reverse the linked list
    public static ListNode Reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }

    //method to convert Input to linkedlist
    public static ListNode convert(String Input){
        ListNode Text=new ListNode(Input.charAt(0));
        ListNode current=Text;
        for(int i=0;i<Input.length();i++){
            current.next=new ListNode(Input.charAt(i));
        }

        return Text;
    }

    //main method
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System\nVersion : 1.0.00.0\nSystem Initialized Successfully.");

        //Uc 7  Deque string method
        String Input=new String("level");
        System.out.println("Input Text: "+Input);
        System.out.println("Is it Palindrome? : "+PalindromeCheckerLinkedList(Input));
    }
}