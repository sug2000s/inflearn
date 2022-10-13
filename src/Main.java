import java.util.*;

class Main {
    class Point{
        private int x;
        private int y;
        private int dir;
        Point(int x, int y, int dir){
            this.x = x;
            this.y= y;
            this.dir=dir;
        }
    }
    static int[] dx = { 1, 1 ,-1, -1};
    static int[] dy = {-1 ,1 ,1 ,-1};
    static Queue<Point> Q = new LinkedList<Point>();

    void BFS(int x, int y,int[][] board){
        board[y][x] = 1;

        for(int i=0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && ny >=0 && nx < 8 && ny<8 && board[ny][nx] == 0){
                board[ny][nx] = 1;
                Q.add(new Point(nx, ny, i));
            }

        }

        while(!Q.isEmpty()){
            Point p = Q.poll();
            int dir = p.dir;
            int nx = p.x+dx[p.dir];
            int ny = p.y+dy[p.dir];
            if(nx>=0 && ny >=0 && nx < 8 && ny<8 && board[ny][nx] == 0){
                board[ny][nx] = 1;
                Q.add(new Point(nx, ny, p.dir));
            }

        }


    }
    public int solution(String[] bishops) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        List<Point> list = new ArrayList<Point>();

        int[][] board = new int[8][8];
        for(String s : bishops){
            char[] c = s.toCharArray();
            int x = c[0] - 'A';
            int y = c[1] - '1';

            BFS(x,y,board);
        }



        return answer;
    }


    public static void main(String[] args) {
        Main sol = new Main();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
       // System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}