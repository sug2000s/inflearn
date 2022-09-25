import java.lang.reflect.Array;
import java.util.*;
class Main {
    public int solution(int n, int m, int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int lt=0,rt=n-1;
        while(lt<=rt){
            int mid = (lt+rt)/2;
            int midNum = arr[mid];
            if(midNum > m){
                rt = mid-1;
            }else if(midNum<m){
                lt = mid+1;
            }else if(midNum == m){
                answer = mid+1;
                break;

            }

        }
        System.out.println(Arrays.toString(arr));

        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}

/*
8 32
23 87 65 12 57 32 99 817
*/