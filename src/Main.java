import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos=str.indexOf(' '))!=-1){

            System.out.println("pos:" + pos);
            String tmp = str.substring(0,pos);
            int len =tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str = str.substring(pos+1);
        }

        if(str.length()>m) answer = str;

        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();//한줄을 입력하는 경우
        System.out.println(T.solution(str));

    }
}