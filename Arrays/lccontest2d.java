class lccontest2d {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = matrix[i][j];
            }
        }

        int[] maxc = new int[n];
        for (int i = 0; i < n; i++) {
            int max = matrix[0][i];
            for (int j = 0; j < m; j++) {

                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }

            }

            maxc[i] = max;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] == -1) {
                    ans[i][j] = maxc[j];
                }
            }
        }

        return ans;

    }
}