/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node>arthi=new HashMap<>();
        Node temp=head;
        
        while(temp!=null)
        {
            Node copynode=new Node(temp.val);
            arthi.put(temp,copynode);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            Node copynode=arthi.get(temp);
            copynode.next=arthi.get(temp.next);
            temp=temp.next;
            

        }
        temp=head;
        while(temp!=null)
        {
             Node copynode=arthi.get(temp);
            copynode.random=arthi.get(temp.random);
            temp=temp.next;
            

        }
        return arthi.get(head);
    
    
        
       

        
    }
}
