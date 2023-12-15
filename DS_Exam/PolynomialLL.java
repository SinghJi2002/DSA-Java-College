public class PolynomialLL {
    public Node head;
    public class Node{
        public int value;
        public int power;
        public Node next;
        public Node(int value,int power){
            this.value=value;
            this.power=power;
        }
        public Node(int value,int power,Node next){
            this.value=value;
            this.power=power;
            this.next=next;
        }
    }
    public PolynomialLL(){
        this.head=null;
    }
    public void insert(int value,int power){
        if(head==null){
            Node newNode=new Node(value, power);
            head=newNode;
            return;
        }
        Node newNode=new Node(value, power);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void add(PolynomialLL L1,PolynomialLL L2){
        Node head1=L1.head;
        Node head2=L2.head;
        while(head1!=null && head2.next!=null){
            int value=head1.value+head2.value;
            System.out.print(value+'x'+head1.power+'+');
        }
        while(head1!=null){
            int value=head1.value;
            System.out.print(value+'x'+head1.power+'+');
        }
        while(head2.next!=null){
            int value=head2.value;
            System.out.print(value+'x'+head2.power+'+');
        }
    }
}
