package linkedlist;

public class Solve {
     class  SinglyLinkedListNode {
         int data;

         public SinglyLinkedListNode(int data) {
             this.data = data;
         }

         SinglyLinkedListNode next;
     }


    public static void main(String[] args) {
        
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode current;
        int count = 0;

        if(head1.data < head2.data)
            current = head1;
        else
            current = head2;


        while(current != null) {
            if(current.next == null && count < 1){
                count++;
                current.next = head2;
            }
            current = current.next;
        }

        return head1;

    }

}
