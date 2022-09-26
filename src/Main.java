import java.util.*;
class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data=val;
        lt=rt=null;
    }
}

public class Main{
    Node root;
    int BFS(Node root){
        Queue<Node> Q = new LinkedList<Node>();
        Q.offer(root);
        int L = 0 ;

        while(!Q.isEmpty()){
            Node node = Q.poll();
            if(node.lt == null || node.rt == null ) return L-1;
            if(node.lt != null) Q.offer(node.lt );
            if(node.rt != null) Q.offer(node.rt );
            L++;

        }

        return 0;
    }

    public static void main(String args[]) {
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}