import java.util.*;
class Main {
    public int solution(String str){
        int answer=0;
        Stack<String > stack = new Stack<String>();
        String[] arrStr = str.split("");
        String numstr = "1234567890";
        for(String s : arrStr){
            if(numstr.indexOf(s)>0){
                stack.push(s);
            }else{
                int sum = 0;

                String s2 = stack.pop();
                String s1 = stack.pop();

                if("*".equals(s)){
                    sum = Integer.parseInt(s1) * Integer.parseInt(s2);
                }else if("/".equals(s)){
                    sum = Integer.parseInt(s1) / Integer.parseInt(s2);
                }else if("+".equals(s)){
                    sum = Integer.parseInt(s1) + Integer.parseInt(s2);
                }else if("-".equals(s)){
                    sum = Integer.parseInt(s1) - Integer.parseInt(s2);
                }
                stack.push(Integer.toString(sum));

            }
        }

        answer = Integer.parseInt(stack.peek());

        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        //String str=kb.next();
        String str= "352+*9-";
        System.out.println(T.solution(str));
    }
}