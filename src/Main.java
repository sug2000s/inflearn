import java.util.*;
class Main {
    public int solution(int n, int k){
        int answer=0;
        Queue<Integer> qu = new LinkedList<Integer>();

        for(int i=1; i<=n; i++){
            qu.add(i);

        }
        int cnt = 1;

        while(qu.size()>1){
            int tmp = qu.poll();
            if(cnt == 3){
                cnt = 0;
            }else{
                qu.add(tmp);
            }
            cnt++;
        }
        answer = qu.poll();

        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        //int n=kb.nextInt();//8
        //int k=kb.nextInt();//3
        int n=8;
        int k=3;
        System.out.println(T.solution(n, k));
    }
}