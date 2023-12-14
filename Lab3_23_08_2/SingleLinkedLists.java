

public class SingleLinkedLists{

    
    public Node head;
    public Node tail;
    public int size;

    
    public SingleLinkedLists(){
        this.size=0;
    }

    
    public class Node{
       
        private int value;
        private Node next;

        
        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    
    
    
    
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
        }
        if(index==size-1){
            insertLast(val);
        }
        
        Node temp=head;

        for(int i=1;i<index;i++){
            temp=temp.next;
        }

        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    
    public void deleteFirst(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }
    
    public void deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node temp=head;
        for(int i=1;i<size-1;i++){
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;
    }

    public void delete(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node after=temp.next.next;
        temp.next=after;
        size--;
    }

    
    public boolean isCyclic(){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return(true);
            }
        }
        return(false);
        
    }

    public static void main(String[] args){
        SingleLinkedLists newLinkedList=new SingleLinkedLists();
        SingleLinkedLists newLinkdList=new SingleLinkedLists();
        newLinkedList.insertLast(1);
        newLinkedList.insertLast(4);
        newLinkedList.insertLast(2);
        newLinkedList.insertLast(9);
        newLinkedList.insertLast(8);
        newLinkedList.insertLast(3);
        newLinkedList.insertLast(6);
        newLinkedList.insertLast(5);
        newLinkedList.insertLast(7);
        newLinkdList.insertLast(3);
        newLinkdList.insertLast(5);
        newLinkdList.insertLast(7);
        newLinkdList.insertLast(8);
        boolean c=newLinkdList.isCyclic();
        System.out.println(c);
    }
    
}
