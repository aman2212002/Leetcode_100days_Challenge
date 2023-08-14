class Solution {
    public int characterReplacement(String s, int k) {
         int[] charCounts = new int[26];
        int maxLen = 0;
        int maxCount = 0;
        int start = 0;
        
        for (int end = 0; end < s.length(); end++) {
            charCounts[s.charAt(end) - 'A']++;
            maxCount = Math.max(maxCount, charCounts[s.charAt(end) - 'A']);
            int replacementsNeeded = end - start + 1 - maxCount;
            
            if (replacementsNeeded > k) {
                charCounts[s.charAt(start) - 'A']--;
                start++;
            }
            
            maxLen = Math.max(maxLen, end - start + 1);
        }
        
        return maxLen;
    }
}