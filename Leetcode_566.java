class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
     int totalElements = mat.length * mat[0].length;
        if (totalElements != r * c || totalElements % r != 0) {
            return mat;
        }
        final int[][] result = new int[r][c];
        int newR = 0;
        int newC = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                result[newR][newC] = mat[i][j];
                newC++;
                if (newC == c) {
                    newC = 0;
                    newR++;
                }
            }
        }
        return result;
    }
}