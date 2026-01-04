import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] heights;
    static boolean[][] isVisited;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        heights = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                heights[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;
        for (int rain = 0; rain <= 100; rain++) {
            int count = 0;
            isVisited = new boolean[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (!isVisited[i][j] && heights[i][j] > rain) {
                        isVisited[i][j] = true;
                        dfs(i, j, rain);
                        count++;
                    }
                }
            }
            answer = Math.max(answer, count);
        }

        System.out.println(answer);
    }

    private static void dfs(int x, int y, int rain) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx <= 0 || nx > n || ny <= 0 || ny > n) continue;

            if (!isVisited[nx][ny] && heights[nx][ny] > rain) {
                isVisited[nx][ny] = true;
                dfs(nx, ny, rain);
            }
        }
    }
}