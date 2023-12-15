import DS_Exam.PolynomialLL.Node;

public class DeletionNodeBST {
    public  Node Search(int value, Node root){
        boolean found=false;
        while(root!=null){
            if(value<root.value){
                Search(value, root.left);
            }
            else if(value>root.value){
                Search(value, root.right);
            }
            else{
                found=true;
                Helper(node);
            }
        }
        if(found){
            System.out.println("Found and deleted");
        }
    }
    public void Helper(){
        Node requiredRoot=Search(10, root)
        Node rightBranch;
        Node leftBranch;
        if(requiredRoot.left!=null){
            leftBranch=requiredRoot.left;
        }
        if(requiredRoot.right!=null){
            rightBranch=requiredRoot.right;
        }
        root=leftBranch;
        Node dummy=root;
        while(dummy.right!=null){
            dummy=dummy.right;
        }
        dummy.right=rightBranch;
    }
}
