// Rotate Image

class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }
        
        // transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        
        // reverse
        for (int n = 0; n < matrix.length; n++) {
            int i = 0;
            int j = matrix.length - 1;
            
            while (i <= j) {
                int tmp = matrix[n][i];
                matrix[n][i] = matrix[n][j];
                matrix[n][j] = tmp;
                
                i++;
                j--;
            }
        }
    }
}