import java.util.*;
class Main {
    public int solution(int[][] board, int[] moves){
        int answer=0;
        Stack<Integer> stack = new Stack<Integer>();

        for(int ix : moves){
            boolean chk = true;
            int cnt = 0;
            while(chk){
                int pickNum = board[cnt++][ix-1];
                if(pickNum > 0){
                    int prevNum = 0;
                    if(!stack.empty()){
                        prevNum = stack.pop();
                    }
                    if(prevNum != pickNum){
                        stack.push(prevNum);
                        stack.push(pickNum);
                    }else{
                        answer+=2;
                    }
                    chk = false;
                }
            }


        }

        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] board=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=kb.nextInt();
            }
        }
        int m=kb.nextInt();
        int[] moves=new int[m];
        for(int i=0; i<m; i++) moves[i]=kb.nextInt();
        System.out.println(T.solution(board, moves));
    }
}