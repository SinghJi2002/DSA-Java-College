package Lab7_23_09_30;

public class C_Postfix_Prefix {
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
        C_Postfix_Prefix s=new C_Postfix_Prefix();
        String c="ab+c/d*ef^-";
        int stringLength=c.length();
        int index=0;
        while(index<stringLength){
            char CharString=c.charAt(index);
            if(Character.isLetter(CharString)){
                String StringToPush=""+CharString;
                s.push(StringToPush);
            }
            else{
                String A=s.peek();
                s.pop();
                String B=s.peek();
                s.pop();
                String Sol=""+CharString+B+A;
                s.push(Sol);
            }
            index++;
        }
        System.out.println(s.peek());
    }
}
