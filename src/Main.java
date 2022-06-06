import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            ///char a = 'Z'; //A:65 Z : 90, a 97 z : 122
            if(x>=97 && x<=122){
                answer += (char)(x-32);
            }else{
                answer += (char)(x+32);
            }

        }
        

        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));

    }
}