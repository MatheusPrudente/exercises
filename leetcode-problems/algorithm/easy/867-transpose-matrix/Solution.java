class Solution {
    public int[][] transpose(int[][] matrix) {
        int maxRow = matrix.length;
        int maxColumn = matrix[0].length;
        int[][] transposeOfMatrix = new int[maxColumn][maxRow];

        for (int i = 0; i < maxColumn; i++) {
            for (int j = 0; j < maxRow; j++) {
                transposeOfMatrix[i][j] = matrix[j][i];
            }
        }
        return transposeOfMatrix;
    }
}
