import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


/**
 * 미로탐색
 * 최단 거리 => bfs
 */
public class Main {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N, M;

    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        int[] temp = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = temp[0];
        M = temp[1];
        int[][] miro = new int[N + 1][M + 1];
        for (int i = 1; i < N + 1; i++) {
            String line = reader.readLine();
            for (int j = 1; j < M + 1; j++) {
                miro[i][j] = line.charAt(j - 1) - '0';
            }
        }

        bfs(miro);
        System.out.println(miro[N][M]);

    }

    public static void bfs(int[][] miro) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N + 1][M + 1];
        queue.offer(new int[]{1, 1});
        visited[1][1] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx < 0 || nx > N || ny < 0 || ny > M) continue;
                
                if (miro[nx][ny] == 1 && !visited[nx][ny]) {
                    miro[nx][ny] = miro[cur[0]][cur[1]] + 1;
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                }
            }


        }
    }
}