class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows = triangle.size();
        
        
        int[][] dp = new int[rows][];
        for (int i = 0; i < rows; i++) {
            dp[i] = new int[triangle.get(i).size()];
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = triangle.get(i).get(j);
            }
        }
      
        
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] += Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }
        
        return dp[0][0];
    }
}