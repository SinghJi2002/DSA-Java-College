package Lab6_23_09_23;

public class B_queueLL {
    //Structuring the nodes.
    class Node{
        public int value;
        public Node next;
        public Node(){}
        public Node(int val){
            this.value=val;
        }
        public Node(int val,Node next){
            this.value=val;
            this.next=next; 
        }
    }
    //Structuring the queue
    public Node head; 
    public B_queueLL(){
        this.head=null;
    }
    //Enqueue
    public void enqueue(int val){
        Node currNode=new Node(val);
        if(head==null){
            head=currNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=currNode;
        }
    }
    //isEmpty
    public boolean isEmpty(){
        if(head==null){
            return(true);
        }
        return(false);
    }
    //Dequeue
    public int dequeue(){
        if(isEmpty()){
            System.out.println("There is no element to delete.Initiating exit!!");
            return(-1);
        }
        int valueToReturn=head.value;
        head=head.next;
        return(valueToReturn);
    }
    //Traverse
    public void traverse(){
        if(isEmpty()){
            System.out.println("There is no element to display. Initiating exit!!");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
        return;
    }

    public static void main(String[] args) {
        B_queueLL queue=new B_queueLL();
        queue.enqueue(10);
        queue.enqueue(1);
        queue.enqueue(9);
        queue.enqueue(4);
        queue.enqueue(6);
        int val=queue.dequeue();
        queue.traverse();
    }
}
