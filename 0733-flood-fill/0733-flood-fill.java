class Solution {
    public void dfs(int row, int col, int[][] image, int[][] ans, int iniColor, int color, int[] dr, int[] dc, int n, int m){
        ans[row][col]=color;
        for(int i=0;i<4;i++){
            int nRow=row+dr[i];
            int nCol=col+dc[i];

            if(nRow >=0 && nRow < n && nCol >=0 && nCol < m && image[nRow][nCol] == iniColor && ans[nRow][nCol] != color){
                dfs(nRow, nCol, image, ans, iniColor, color, dr, dc, n, m);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans=image;
        int iniColor=image[sr][sc];

        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};

        int n=image.length;
        int m=image[0].length; 

        dfs(sr, sc, image, ans, iniColor, color, dr, dc, n, m);
        return ans;
    }
}