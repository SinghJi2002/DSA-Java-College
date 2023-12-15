import java.util.ArrayList;
import java.util.Stack;

public class DFS {
    public ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>> adj,int root){
        int lenght=adj.size();
        boolean[] visited=new boolean[lenght];
        boolean[0]=true;
        Stack<Integer> s=new Stack<>();
        ArrayList<Integer> sol=new ArrayList<>();
        s.push(root);
        while(!s.isEmpty()){
            int popod=s.pop();
            ArrayList<Integer> adjElement=adj.get(popod);
            int len=adjElement.size();
            int i=0;
            while(i<len){
                int element=adjElement.get(i);
                if(!visited[element]){
                    visited[element]=true;
                    s.push(element);
                }
            }
        }
    }
}
