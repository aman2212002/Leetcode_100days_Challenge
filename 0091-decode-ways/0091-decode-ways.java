class Solution {
    public int numDecodings(String s) {
     int[] memo = new int[s.length() + 1];
        Arrays.fill(memo, -1);
        return decodeWays(s, 0, memo);
    }

    private int decodeWays(String s, int index, int[] memo) {
        if (index == s.length()) {
            return 1;
        }

        if (s.charAt(index) == '0') {
            return 0;
        }

        if (memo[index] != -1) {
            return memo[index];
        }

        int ways = decodeWays(s, index + 1, memo);

        if (index < s.length() - 1) {
            int twoDigits = Integer.parseInt(s.substring(index, index + 2));
            if (twoDigits >= 10 && twoDigits <= 26) {
                ways += decodeWays(s, index + 2, memo);
            }
        }

        memo[index] = ways;
        return ways;
}
}