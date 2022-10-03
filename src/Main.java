import java.util.*;
class Main{
    static int[] pm, ch, arr;
    static int n, m;
    public void DFS(int L){
        if(L==m){
            if(pm[0]==pm[1]){
                return;
            }else{
                System.out.println(Arrays.toString(pm));
            }

        }else{
            for(int i=1; i<=n;i++){
                pm[L] = arr[i-1];
                DFS(L+1);
            }
        }

    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        ch=new int[n];
        pm=new int[m];
        T.DFS(0);
    }
}

/*
3 2
3 6 9
 */