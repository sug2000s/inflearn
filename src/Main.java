import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Main {
    static int m;
    static int k;
    static int[] chk;
    static int[] pm;
    static int ans = 0;
    void DFS(int L, int s, int sum, int[] arr){
        if(L==m){
            /*for(int i=0 ; i<chk.length; i++){
                if(chk[i]>0)System.out.print(arr[i]);

            }*/
            if(sum%k==0){
                System.out.println(Arrays.toString(pm));
                ans++;
            }


        }else{
            for(int i=s;i <arr.length; i++){
                if(chk[i]==0){
                    chk[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1, i+1, sum + arr[i] ,arr);
                    chk[i] = 0;
                }
            }

        }


    }

    public int solution(int[] arr, int K) {

        int answer = 0;
        m = 3;
        k = K;
        pm = new int[m];
        chk = new int[arr.length];

        DFS(0,0,0, arr);
        answer = ans;
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int[] arr = {1, 2, 3,4,5};
        int K = 3;
        int ret = sol.solution(arr, K);


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}