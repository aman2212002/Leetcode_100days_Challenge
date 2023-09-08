class Solution {
    public int findJudge(int n, int[][] trust) {
     int[] incomingTrusts = new int[n + 1];
    int[] outgoingTrusts = new int[n + 1];

    for (int[] relation : trust) {
        int a = relation[0];
        int b = relation[1];
        outgoingTrusts[a]++;
        incomingTrusts[b]++;
    }

    for (int i = 1; i <= n; i++) {
        if (incomingTrusts[i] == n - 1 && outgoingTrusts[i] == 0) {
            return i;
        }
    }

    return -1;   
    }
}