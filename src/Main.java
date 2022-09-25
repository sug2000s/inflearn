import java.util.*;
class Main {
    public int[] solution(int size, int n, int[] arr){
        int[] cache=new int[size];
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length-1;i++){

            for(int j=0; j<cache.length;j++){
                int newNum = arr[i];
                int curNum = cache[j];
                int nextNum = cache[j+1];

            }




        }

        return cache;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt();
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : T.solution(s, n, arr)) System.out.print(x+" ");
    }
}
/*
5 9
1 2 3 2 6 2 3 5 7
 */