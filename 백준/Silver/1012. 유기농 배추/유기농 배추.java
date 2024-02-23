import java.util.Scanner;

public class Main {
    static int deliciousCabbage[][];
    static int answer;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int loop =scan.nextInt();
        for (int aaaaa=0; aaaaa<loop; aaaaa++) {
            answer=0;
            /* 배추배추 입력받기 시작 */
            int width = scan.nextInt();
            int height = scan.nextInt();
            int count = scan.nextInt();

            deliciousCabbage = new int[width][height];

            for (int i = 0; i < count; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                deliciousCabbage[x][y] = 1;
            }
            /* 배추배추 입력받기 끝 */
            for (int i = 0; i < deliciousCabbage.length; i++) {
                for (int j = 0; j < deliciousCabbage[i].length; j++) {
                    if (deliciousCabbage[i][j] == 1) {
                        ddffss(i, j);
                        answer += 1;
                    }
                }
            }
            System.out.println(answer);

        }

    }

    private static void ddffss(int i, int j) {
        deliciousCabbage[i][j]=0;

        if (i+1 < deliciousCabbage.length && deliciousCabbage[i+1][j]==1) { ddffss(i+1,j); }
        if (i-1 >= 0 && deliciousCabbage[i-1][j]==1) { ddffss(i-1,j); }
        if (j+1 < deliciousCabbage[i].length && deliciousCabbage[i][j+1]==1) { ddffss(i,j+1); }
        if (j-1 >= 0 && deliciousCabbage[i][j-1]==1) { ddffss(i,j-1); }
    }
}