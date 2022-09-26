import java.util.*;
class Main {
    int[] dx = {-1,1, 5};

    int BFS(int s, int e){
        Queue<Integer> Q = new LinkedList<Integer>();
        Q.offer(s);
        int answer = 0;

        while(!Q.isEmpty()){
            int cur = Q.poll();
            for(int i=0; i<dx.length; i++){
                int last = cur + dx[i];
                if(last == e){
                    return last;
                }else{
                    Q.offer(last);
                }
            }
            answer++;
        }
        return  0;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt();
        int e=kb.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
/*
5 14

8 3

 */