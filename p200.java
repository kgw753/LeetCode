public class p200 {

    public static int N, M;
    public static int[] dy = {0, 1, 0, -1};
    public static int[] dx = {1, 0, -1, 0};
    public static boolean[][] visited;

    public int numIslands(char[][] grid) {
        int ret = 0;
        N = grid.length;
        M = grid[0].length;
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(visited[i][j]) continue;
                if(grid[i][j] == '1'){
                    dfs(i, j, grid);
                    ret++;
                }
            }
        }

        return ret;
    }

    public static void dfs(int y, int x, char[][] grid){
        visited[y][x] = true;

        for(int i = 0; i < 4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];

            if(ny < 0 || nx < 0 || ny >= N || nx >= M || visited[ny][nx]) continue;
            if(grid[ny][nx] == '1') dfs(ny, nx, grid);
        }
    }
}
