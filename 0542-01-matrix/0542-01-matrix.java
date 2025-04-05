class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] ans=mat;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                if(ans[i][j]==0){
                    q.add(new int[]{i,j});
                }else{
                    ans[i][j]=-1;
                }
            }
        }
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        int n=ans.length;
        int m=ans[0].length;
        while(!q.isEmpty()){
            int[] temp=q.remove();
            int a=temp[0];
            int b=temp[1];
            for(int i=0;i<4;i++){
                int nr=a+dr[i];
                int nc=b+dc[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && ans[nr][nc]==-1){
                    ans[nr][nc]=ans[a][b]+1;
                    q.add(new int[]{nr,nc});
                }
            }
        }
        return ans;
    }
}