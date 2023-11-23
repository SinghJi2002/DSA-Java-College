package Lab4_23_09_09;

import java.util.Scanner;

class LinkedLists{
        public Node head;
        public int size;

        public LinkedLists(){
            this.size=0;
        }

        class Node{
            public int value;
            public Node next;

            public Node(int value){
                this.value=value;
            }
            public Node(int value,Node next){
                this.value=value;
                this.next=next;
            }
        }

        public void insertFirst(int value){
            Node newNode=new Node(value);
            Node nextToHead;
            if(head==null){
                head= newNode;
                newNode.next=null;
                return;
            }
            nextToHead=head.next;
            head.next=newNode;
            newNode.next=nextToHead;
            size++;
        }

        public void insert(int value,int index){
            if(size==0){
                insertFirst(value);
            }
            if(index>size){
                System.out.println("Cannot store the element");
                return;
            }
            Node temp=head;
            int currIndex=1;
            while(temp.next!=null && currIndex<index){
                temp=temp.next;
                currIndex++;
            }
            Node newNode=new Node(value);
            Node nextNode=temp.next;
            temp.next=newNode;
            newNode.next=nextNode;
        }

        public void display(){
            if(size==0){
                System.out.println("Nothing to display");
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                System.out.print(temp.value+"->");
                temp=temp.next;
            }
            System.out.print("End");
        }

        public void delete(int index){
            if(index>=size){
                System.out.println("Nothing can be deleted");
                return;
            }
            Node temp=head;
            int currIndex=1;
            while(temp.next!=null && currIndex<index){
                temp=temp.next;
                currIndex++;
            }
            Node nextNode=temp.next;
            Node nextToNextNode=nextNode.next;
            temp.next=nextToNextNode;
            size--;
        }

        public void polyAddition(LinkedLists LL1,LinkedLists LL2){
            Node pointer1=LL1.head;
            Node pointer2=LL2.head;
            LinkedLists add=new LinkedLists(); 
            while(pointer1.next!=null && pointer2.next!=null){
                int sum=pointer1.value+pointer2.value;
                add.insertFirst(sum);
                pointer1=pointer1.next;
                pointer2=pointer2.next;
            }
            add.polyDisplay();
        }

        public void polyDisplay(){
            if(size==0){
                System.out.println("Nothing to display");
                return;
            }
            int maxDegee=size-1;
            Node temp=head;
            while(temp.next!=null){
                System.out.println(temp.value+"x^"+maxDegee);
                maxDegee--;
                temp=temp.next;
            }
        }
    }


public class SingleLinkedListPolyAdd{
    public static void main(String[] args) {
        LinkedLists L=new LinkedLists();
        LinkedLists Lnext=new LinkedLists();
        System.out.println("Enter max degree");
        Scanner sc=new Scanner(System.in);
        int maxDegree=sc.nextInt();
        int degree=0;
        while(degree<=maxDegree){
            System.out.println("Enter Element for poly1 for degee "+maxDegree);
            int ele1=sc.nextInt();
            System.out.println("Enter Element for poly2 for degee "+maxDegree);
            int ele2=sc.nextInt();
            L.insertFirst(ele1);
            Lnext.insertFirst(ele2);
            degree++;
        }
        L.display();
        Lnext.display();
        L.polyAddition(L,Lnext);
    }
}

