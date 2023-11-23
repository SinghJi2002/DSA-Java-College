package Lab6_23_09_23;

public class C_circularQueueLL {
    //Lets setup the nodes.
    class Node{
        public int value;
        public Node next;
        public Node prev;
        public Node(){}
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
        public Node(int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
    //Lets setup the queue
    public Node head;
    public Node tail;
    public C_circularQueueLL(){
        this.head=null;
        this.tail=null;
    }
    //Enqueue
    public void enqueue(int value){
        Node currTemp=new Node(value);
        if(head==null){
            head=currTemp;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=currTemp;
        currTemp.prev=temp;
        temp=temp.next;
        tail=temp;
        tail.next=head;
        head.prev=tail;
    }
    //Dequeue
    public void dequeue(){
        if(head==null){
            System.out.println("Nothing to delete. Initiating exit!!");
            return;
        }
        if(tail==null){
            head=null;
            return;
        }
        Node temp=head.next;
        head=temp;
        tail.next=head;
        head.prev=tail;
    }
    //Traverse
    public void traverse(){
        if(head==null){
            System.out.println("Nothing to display.Initiating exit!!");
            return;
        }
        Node temp=head;
        while(temp!=tail){
            System.out.println(temp.value);
        }
        if(tail!=null){
            System.out.println(tail.value);
        }
    }
    public static void main(String[] args) {
        C_circularQueueLL queue=new C_circularQueueLL();
        queue.enqueue(10);
        queue.enqueue(8);
        queue.traverse();
    }
}
