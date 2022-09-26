import java.util.*;
class Main {
    static int n, m, answer=0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v){
        Queue<Integer> Q = new LinkedList<Integer>();
        Q.offer(v);
        while(!Q.isEmpty()){
            Q.poll();
            for(int i=1; i<graph.length; i++){
                for(int j=1; j<graph[i].length;j++){
                    int nextnum = graph[i][j];
                    if(nextnum>0)Q.offer(j);
                }
            }


        }

    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph=new int[n+1][n+1];
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph[a][b]=1;
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}
/*

5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
 */