class Solution {
    public int countPairs(List<Integer> nums, int target) {
      nums.sort(null);
        int n = nums.size();
        int count = 0;

        int left = 0, right = n - 1;
        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += right - left; 
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}