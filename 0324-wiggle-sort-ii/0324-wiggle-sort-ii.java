class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums); 
        int[] result = new int[nums.length];
        int middle = (nums.length + 1) / 2; 
        int evenIndex = middle - 1; 
        int oddIndex = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = nums[evenIndex];
                evenIndex--;
            } else {
                result[i] = nums[oddIndex];
                oddIndex--;
            }
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}