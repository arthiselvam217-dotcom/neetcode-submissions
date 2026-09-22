public class Node{
   int key;
   int value;
   Node prev;
   Node next;
   Node(int key,int value)
   {
    this.key=key;
    this.value=value;
    this.prev=null;
    this.next=null;
   }
    
}
class LRUCache {
     private int capacity;
     private HashMap<Integer,Node>cache;
     private Node left;
     private Node right;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.cache=new HashMap<>();
        this.left=new Node(0,0);
        this.right=new Node(0,0);
        this.left.next=this.right;
        this.right.prev=this.left;
        
    }
    public void remove(Node node)
    {
        Node prv=node.prev;
        Node nxt=node.next;
        prv.next=nxt;
        nxt.prev=prv;
    }
    public void insert(Node node)
    {
        Node prev=this.right.prev;
        prev.next=node;
        node.prev=prev;
        node.next=this.right;
        this.right.prev=node;
    }
    public int get(int key) {
        if(cache.containsKey(key))
        {
            Node node=cache.get(key);
            remove(node);
            insert(node);
            return node.value;

        }
        return -1;

        
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key))
        {
            remove(cache.get(key));
        }
        Node newnode=new Node(key,value);
        cache.put(key,newnode);
        insert(newnode);
        if(cache.size()>this.capacity){
            Node lru=this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
        
    }
}

