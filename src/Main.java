import java.util.*;
class Main{
    static int[] pm;
    static int n, m;
    public void DFS(int L){
        if(L==m){
            System.out.println(Arrays.toString(pm));

        }else{
            for(int i=1;i<=n; i++){
                pm[L] = i;
                DFS(L+1);

            }
        }

    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        pm=new int[m];
        T.DFS(0);
    }
}

/*

3 2

 */