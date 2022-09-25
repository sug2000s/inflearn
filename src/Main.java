import java.util.*;
class Main {
    static int[] chk;
    static int n;
    public void DFS(int L){
        if(L==n+1){
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < chk.length-1; i++){
                if(chk[i] > 0 ){
                    sb.append(Integer.toString(i));
                }
            }
            System.out.println(sb.toString());
            return;
        }else{
            chk[L] = 1;
            DFS(L+1);
            chk[L] = 0;
            DFS(L+1);
        }

    }

    public static void main(String[] args){
        Main T = new Main();
        n=8;
        chk = new int[n+2];

        T.DFS(1);

    }
}
