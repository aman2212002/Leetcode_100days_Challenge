class Solution {
    public int longestSubstring(String s, int k) {
         int maxLen = 0;
        
        for (int uniqueTarget = 1; uniqueTarget <= 26; uniqueTarget++) {
            int[] charCount = new int[26]; 
            int uniqueCount = 0;
            int atLeastKCount = 0;
            int start = 0;
            
            for (int end = 0; end < s.length(); end++) {
                if (charCount[s.charAt(end) - 'a'] == 0) {
                    uniqueCount++;
                }
                charCount[s.charAt(end) - 'a']++;
                
                if (charCount[s.charAt(end) - 'a'] == k) {
                    atLeastKCount++;
                }
                
                while (uniqueCount > uniqueTarget) {
                    if (charCount[s.charAt(start) - 'a'] == k) {
                        atLeastKCount--;
                    }
                    charCount[s.charAt(start) - 'a']--;
                    if (charCount[s.charAt(start) - 'a'] == 0) {
                        uniqueCount--;
                    }
                    start++;
                }
                
                if (uniqueCount == uniqueTarget && uniqueCount == atLeastKCount) {
                    maxLen = Math.max(maxLen, end - start + 1);
                }
            }
        }
        
        return maxLen;
    }
}