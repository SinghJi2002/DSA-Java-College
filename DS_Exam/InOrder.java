public class InOrder {
    public void InOrder(){
        InOrder(root);
    }
    public void InOrder(Node node){
        if(node==null){
            return;
        }
        InOrder(node.left);
        System.out.println(node.value);
        InOrder(node.right);
    }    
}
