class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;

        int m = mat.length;
        int n = mat[0].length;

        int[] rowCount = new int[m];
        int[] colsCount = new int[n];

        for(int row=0;row<m;row++){
            for(int cols=0;cols<n;cols++){
                if(mat[row][cols]==1){
                    rowCount[row]++;
                    colsCount[cols]++;
                }
            }
        }

        for(int row=0;row<m;row++){
            for(int cols=0;cols<n;cols++){
                if(mat[row][cols]==1){
                    if(rowCount[row] == 1 && colsCount[cols] == 1){
                        count++;
                    }
                }
            }
        }
        return count;
        
    }
}