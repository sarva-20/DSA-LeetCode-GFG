class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] GRID = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    GRID[i][j]=1;
                }else{
                    GRID[i][j] = GRID[i][j-1] + GRID[i-1][j];
                }
            }
        }
        return GRID[m-1][n-1];
    }
}