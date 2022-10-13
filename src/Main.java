import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Main {
    int solution(int[][] teams){
        List<Integer>  t1 = new ArrayList<Integer>();
        List<Integer>  t2 = new ArrayList<Integer>();

        t1.add(teams[0][0]);
        t1.add(teams[0][1]);

        //초기화
        for(int i=1; i<teams.length;i++){
            if(t1.contains(teams[i][0]) || t1.contains(teams[i][1])  ){
                if(!t1.contains(teams[i][0])){
                    t1.add(teams[i][0]);
                }else if(!t1.contains(teams[i][1])){
                    t1.add(teams[i][1]);
                }
            }else{

                if(!t2.contains(teams[i][0]))t2.add(teams[i][0]);
                if(!t2.contains(teams[i][1]))t2.add(teams[i][1]);

            }
        }


        System.out.println(t1.toString());
        System.out.println(t2.toString());
        return 0;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int[][] teams = {{1,2},{2,3},{4,5},{7,5}};
        int ret1 = sol.solution(teams);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");


    }
}