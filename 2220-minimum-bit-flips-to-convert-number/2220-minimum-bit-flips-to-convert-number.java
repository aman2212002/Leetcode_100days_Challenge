class Solution {
    public int minBitFlips(int start, int goal) {
        int xorResult = start ^ goal;
        int count = 0;

        while (xorResult > 0) {
            count += xorResult & 1; // Check if the least significant bit is set
            xorResult >>= 1; // Right-shift to check the next bit
        }

        return count;
    }
}