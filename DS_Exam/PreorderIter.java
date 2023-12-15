import java.util.ArrayList;
import java.util.Stack;

import DS_Exam.PolynomialLL.Node;

public class PreOrderIter {
    public void PreOrder(Node root){
        Stack<Node> s=new Stack<>();
        ArrayList<Integer> val=new ArrayList<>();
        Node temp=root;
        if(temp!=null){
            s.push(temp);
        }
        while(!s.isEmpty()){
            Node node=s.pop();
            val.add(node.value);
            if(node.right!=null){
                s.push(node.right);
            }
            if(node.left!=null){
                s.push(node.left);
            }
        }
    }    
}
