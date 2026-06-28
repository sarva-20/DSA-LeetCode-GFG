class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // Define start of rows and cols
        int n = matrix.length;
        int m = matrix[0].length;

        // Another start for elimiation process
        int row=0;
        int cols=m-1;

        // Run until row and col reached end
        while(row<n && cols>=0){
            if(matrix[row][cols]==target){
                return true;
            }else if(matrix[row][cols]<target){
                row++;
            }else{
                cols--;
            }
        }
        return false;
    }
}