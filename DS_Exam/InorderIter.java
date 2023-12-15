import java.util.ArrayList;
import java.util.Stack;

import DS_Exam.PolynomialLL.Node;

public class InorderIter {
    public void InorderIter(Node root){
        ArrayList<Integer> values=new ArrayList<>();
        Stack<Node> s=new Stack<>();
        Node node=root;
        while(true){
            if(node!=null){
                s.push(node);
                node=node.left;
            }
            else{
                if(s.isEmpty()){
                    break;
                }
                node=s.pop();
                values.add(node.value);
                node=node.right;
            }
        }
    }
        
}
