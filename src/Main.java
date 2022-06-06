import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public String solution(String str){ 
        String answer = "";

        for(int i = 0; i<str.length();i++)
        {
            if(str.indexOf(str.charAt(i))==i) answer +=str.charAt(i);//중복을 찾는 방법 외우면 좋음.

        }

        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb =new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}