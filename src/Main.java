import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Main {
    int solution(int[] dices){
        int[] chk = new int[dices.length];

        //초기화
        if(dices[0]%2==0){
            chk[0] = 1;
        }else{
            chk[0] = -1;
        }
        for(int i=1;i<dices.length;i++){
            if(dices[i]%2==0){
                if(chk[i-1]<0){
                    chk[i] = 1;
                }else{
                    chk[i] = chk[i-1] + 1;
                }
            }else if(dices[i]%2!=0){
                if(chk[i-1]>0){
                    chk[i] = -1;
                }else{
                    chk[i] = chk[i-1] - 1;
                }
            }
        }

        System.out.println(Arrays.toString(chk));


        return 0;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] dices = {3, 3, 2, 2, 2};
        int ret1 = sol.solution(dices);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");


    }
}