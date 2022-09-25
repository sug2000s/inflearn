import java.util.*;

class Main {
    public int[] solution_selectionSorting(int n, int[] arr){
        //1. 선택 정열
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                int selNum = arr[i];
                int movNum = arr[j];
                if(selNum > movNum){
                    arr[j] = selNum;
                    arr[i] = movNum;

                }
            }
        }
        return arr;
    }

    public int[] solution_bubbleSorting(int n, int[] arr){
        //2. 버블 정열
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                int prevNum = arr[j-1];
                int nextNum = arr[j];
                if(prevNum > nextNum){
                    arr[j] = prevNum;
                    arr[j-1] = nextNum;
                }
            }

        }

        return arr;
    }

    public int[] solution_insertSorting(int n, int[] arr){
        //3. 삽입 정열
        for(int i=1;i<arr.length;i++){

            for(int j=i; j>0; j--){
                int prevNum = arr[j-1];
                int currNum = arr[j];
                if(prevNum > currNum){
                    arr[j-1] = currNum;
                    arr[j] = prevNum;
                }

            }

        }
        return arr;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : T.solution_insertSorting(n, arr)) System.out.print(x+" ");
    }
}
/*
6
13 5 11 7 23 15
 */