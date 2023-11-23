package Lab7_23_09_30;

//Lets first build a stack
public class B_Postfix_Infix{
    class Node{
        String value;
        Node next;
        public Node(){}
        public Node(String value){
            this.value=value;
        }
        public Node(String value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    Node head=new Node();

    public void push(String value){
        if(head==null){
            head.value=value;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node storeValue=new Node(value);
        temp.next=storeValue;
        temp=temp.next;
    }

    public boolean isEmpty(){
        if(head==null){
            return(true);
        }
        return(false);
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Nothing to pop!!");
            return;
        }
        Node temp=head;
        if(temp.next==null){
            head=null;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public String peek(){
        if(isEmpty()){
            System.out.println("Nothing to peek");
            return("-1");
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return(temp.value);
    }

    public static void main(String[] args) {
        B_Postfix_Infix s=new B_Postfix_Infix();
        String c="ab+cd/*";
        int stringLength=c.length();
        int index=0;
        while(index<stringLength){
            if(Character.isLetter(c.charAt(index))){
                String sol=""+c.charAt(index);
                s.push(sol);
            }
            else{
                String a=s.peek();
                s.pop();
                String b=s.peek();
                s.pop();
                String sol=""+"("+b+c.charAt(index)+a+")";
                s.push(sol);
            }
            index++;
        }
        System.out.print(s.peek());
    }
}
