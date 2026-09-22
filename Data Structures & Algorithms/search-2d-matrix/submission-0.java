class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;

        // Find the row that can contain target
        for (i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target &&
                target <= matrix[i][matrix[i].length - 1]) {
                break;
            }
        }

        // No suitable row found
        if (i == matrix.length) {
            return false;
        }

        // Binary search in that row
        int low = 0;
        int high = matrix[i].length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[i][mid] == target) {
                return true;
            } 
            else if (matrix[i][mid] > target) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return false;
    }
}