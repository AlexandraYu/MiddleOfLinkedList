class ListNode {
    int val; 
    ListNode next; 
    ListNode (int x) {
        this.val=x; 
    }
}
public class FindMiddleOfLinkedList{
    public static ListNode middleNode(ListNode head) {
        int count=0; 
        ListNode tmp = head; 
        while (tmp!=null) {
            tmp = tmp.next; 
            count++; 
        }
        count = count/2 +1; 
        tmp = head; 
        for(int i=1; i<count; i++) { //important! when i = 1, the node already goes to the next, so if you need to go to the 3rd node, you only need to do "next" twice. (which is when i=2, counting from i=1)
            tmp=tmp.next; 
        }
        return tmp; 
    }

    public static void main(String []args){
        ListNode odd, even; 
        ListNode n1 = new ListNode(1); 
        ListNode n2 = new ListNode(2); 
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4); 
        ListNode n5 = new ListNode(5); 
        ListNode n6 = new ListNode(6); 
        ListNode n7 = new ListNode(7); 
        ListNode n8 = new ListNode(8);
        ListNode n9 = new ListNode(9);
        n1.next = n2; 
        n2.next = n3; 
        n3.next = n4; 
        
        n5.next=n6; 
        n6.next=n7;
        n7.next=n8; 
        n8.next=n9;
        
        odd = middleNode(n1);  
        even = middleNode(n5); 
        System.out.println("Middle node data of odd-number linked list: "+odd.val+"\n");
        System.out.println("Middle node data of even-number linked list: "+even.val+"\n");
    }
}
