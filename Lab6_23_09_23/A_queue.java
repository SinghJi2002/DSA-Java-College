package Lab6_23_09_23;

public class A_queue{
    public int[] queue;
    public int size=0;
    public int defaultLength=10;
    public int pointer=-1;
    //Creation of queue
    public A_queue(){
        this.queue=new int[defaultLength];
    }
    public A_queue(int length){
        this.queue=new int[length];
    }
    //Enqueue
    public void enqueue(int value){
        if(isFull()){
            System.out.println("No more space left.Initiating exit!!");
            return;
        }
        pointer++;
        queue[pointer]=value;
        size++;
    }
    public boolean isFull(){
        if(size==queue.length){
            return(true);
        }
        return(false);
    }
    //Dequeue
    public int dequeue(){
        if(isEmpty()){
            System.out.println("The queue is already empty. Initiating exit!!");
            return(-1);
        }
        int returnValue=queue[0];
        for(int i=0;i<size-1;i++){
            queue[i]=queue[i+1];
        }
        queue[pointer]=0;
        pointer--;
        size--;
        return(returnValue);
    }
    public boolean isEmpty(){
        if(size==0){
            return(true);
        }
        return(false);
    }
    //Traverse
    public void traverse(){
        if(isEmpty()){
            System.out.println("Nothing to show.Initiating exit");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        A_queue newQueue=new A_queue();
        newQueue.enqueue(1);
        newQueue.enqueue(5);
        newQueue.enqueue(7);
        newQueue.enqueue(4);
        newQueue.enqueue(2);
        int val=newQueue.dequeue();
        newQueue.traverse();
    }
}