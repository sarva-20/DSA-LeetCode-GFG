class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        if(obstacleGrid[0][0] ==1){
            return 0;
        }

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] result = new int[m][n];
        result[0][0]=1;
        
        //Loop for checking the 1st row (since all value in row = 1)
        for(int j=1;j<n;j++){
            if(obstacleGrid[0][j]==1){
                result[0][j]=0;
            }else{
                result[0][j]=result[0][j-1];
            }
        }

        //Loop for checking the 1st column (since all values in column = 1)
        for(int i=1;i<m;i++){
            if(obstacleGrid[i][0]==1){
                result[i][0]=0;
            }else{
                result[i][0]=result[i-1][0];
            }
        }

        //Loop for checking rest of the grid 
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    result[i][j]=0;
                }else{
                    result[i][j]=result[i-1][j] + result[i][j-1];
                }
            }
        }
        return result[m-1][n-1];
    }
}