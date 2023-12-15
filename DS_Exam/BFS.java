import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import SingleLinkedLists.Node;

public class BFS {
    public ArrayList<Integer> BFS(ArrayList<ArrayList<Integer>> adj,int root){
        int lenght=adj.size();
        boolean[] visited=new boolean[lenght];
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> sol=new ArrayList<>();
        visited[0]=true;
        q.add(root);
        while(!q.isEmpty()){
            int poped=q.poll();
            ArrayList<Integer> adjElement=adj.get(poped);
            int len=adjElement.size();
            int i=0;
            while(i<len){
                int element=adjElement.get(i);
                if(!visited[element]){
                    q.add(element);
                    visited[element]=true;
                }
            }
        }
    }
}
